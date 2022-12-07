#!/usr/bin/env groovy

def call(){
    def token = new VaultHelper().getToken()
    println "$token"

    // its work
    //println "$env.GIT_PREVIOUS_COMMIT"
}


