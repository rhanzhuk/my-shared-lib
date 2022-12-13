#!/usr/bin/env groovy

def call (){
    HashMap scmVars = checkout scm
    scmVars.each{ k, v -> println "${k}:${v}" }
}
