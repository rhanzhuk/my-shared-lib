#!/usr/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'jenkins-auth-creds', usernameVariable: "USERNAME", passwordVariable: 'PASSWORD')]) {
        println "Get token from library"

        //println "username: ${USERNAME}"
        //println "password: ${PASSWORD}"

        def token = sh(script: "curl -X POST --data '{\"password\" : \"'${PASSWORD}'\"}' http://65.108.210.185:8211/v1/auth/userpass/login/${USERNAME} | jq -r .auth.client_token", returnStdout: true)
        //println token
    }

}

def auth(){

}

def existSecret(){

}

def createSecret(){

}
