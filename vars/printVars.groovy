#!/usr/bin/env groovy

def call(){
    VaultHelper token = new VaultHelper()
    def tokenRes = token.getToken()
    println tokenRes
    println "Test!"

    // its work
    //println "$env.GIT_PREVIOUS_COMMIT"
}


