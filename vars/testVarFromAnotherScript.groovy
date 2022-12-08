#!/usr/bin/env groovy

def call() {
    def simpleVar = new printVars().run()
    println simpleVar.toString()
    println simpleVar
    //its work!!!
    def simpleVar2 = printVars.test()
    println simpleVar2
}
