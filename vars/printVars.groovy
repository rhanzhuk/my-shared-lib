#!/usr/bin/env groovy

def call(){
    GlobalVars vars = new GlobalVars()
    println "Hello from scripted!"
    if (vars.getCommit() == "") {
        println "NOTHING FROM CLASS"
    } else {
        println vars.getCommit()
    }
    println "Test from cript global var"
    println "$env.GIT_PREVIOUS_COMMIT"
    println $env.GIT_PREVIOUS_COMMIT
}


