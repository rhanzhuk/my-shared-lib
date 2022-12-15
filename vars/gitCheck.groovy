#!/usr/bin/env groovy

def call (){
    HashMap scmVars = checkout scm
    scmVars.each{ k, v -> println "${k}:${v}" }
    String a = testCall()
    println a
}

def testCall() {
    return "Test from another method from script!"
}