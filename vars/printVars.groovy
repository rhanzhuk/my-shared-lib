#!/usr/bin/env groovy

def call(){
    def token = new VaultHelper()
    def tokenRes = token.getToken().toString()
    println tokenRes

    // its work
    //println "$env.GIT_PREVIOUS_COMMIT"
}


