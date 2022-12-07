#!/usr/bin/env groovy

def call() {
    def simpleVar = printVars
    println simpleVar.toString()
    def simpleVar2 = printVars.test()
    println simpleVar2
}
