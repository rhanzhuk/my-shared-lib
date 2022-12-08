#!/usr/bin/env groovy

call() {
    def imageDep = GlobalVars.image
    sh (script: "ssh root@65.108.155.54 \"kubectl set image -n default deployment/spring-flyway-outside spring-flyway-outside=$imageDep\"")
}