#!/usr/bin/env groovy

def call (){
    HashMap scmVars = checkout scm
    scmVars.each{ k, v -> println "${k}:${v}" }
    String a = testCall()
    println a
}

def testCall() {
    int a = 1
    int b = 2
    if (a > b) {
        return "Test from another method from script!"
    }
    error("Test error!!!!!!!!!!!!!!")
}