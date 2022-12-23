#!/usr/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'jenkins-auth-creds', usernameVariable: "USERNAME", passwordVariable: 'PASSWORD')]) {
        println "Check use withCreds from library"

        println "username: ${USERNAME}"
        println "password: ${PASSWORD}"
    }

}

def auth(){

}

def existSecret(){

}

def createSecret(){

}
