#!/usr/bin/env groovy

def call(Map dockerParams) {
    def scmUrl = scm.getUserRemoteConfigs()[0].getUrl()
    node("${params.env}") {
        checkout scm: [
                $class: 'GitSCM',
                branches: [[name: '${tag}']],
                extensions: [[$class: 'SubmoduleOption',
                              parentCredentials: true,
                              recursiveSubmodules: true]],
                userRemoteConfigs: [[credentialsId: 'gitlab', url: scmUrl]]
        ]

        sshagent(['gitlab']) {
            docker.build("${dockerParams.imageName}:${tag}", dockerParams.buildArgs)
        }

        trivy.checkImage(image: "${dockerParams.imageName}", tag: "${tag}")
    }
}