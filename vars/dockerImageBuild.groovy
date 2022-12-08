#!/usr/bin/env groovy

def call() {
    //TODO test to use current build !!!REMOVE after
    def image = null//GlobalVars.image
    if (image == null) {
        currentBuild.result = 'ABORTED'
        println("ERROR! BUILD STOP")
    } else {
        sh(script: "docker build -t $image .")
        sh(script: "docker push $image")
        sh(script: "docker rmi $image")

    }
}