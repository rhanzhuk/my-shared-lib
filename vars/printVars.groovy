#!/usr/bin/env groovy
//import VaultHelper

//static String someVar = "Some var"

def call(){
 //   String someVar = "Some var"
 //   String VAULT_ADDR = 'http://65.108.210.185:8211'
 //   String VAULT_USER = "docker-helper"
 //   String VAULT_PASS = "docker-root"
 //   def token = sh (script: "curl -X POST --data '{\"password\" : \"'$VAULT_PASS'\"}' $VAULT_ADDR/v1/auth/userpass/login/$VAULT_USER | jq -r .auth.client_token")
 //   println token
 //   return token

    // its work
    //println "$env.GIT_PREVIOUS_COMMIT"
}

def test(){
    //return "TEST"
    GlobalVars.commit = "Its global var from script!"

    return GlobalVars.commit
}


