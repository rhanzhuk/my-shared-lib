#!/usr/bin/env groovy

def call() {
    def simpleVar = printVars()
    println simpleVar.toString()
    //its work!!!
    def simpleVar2 = printVars.test()
    println simpleVar2
}
