#!/usr/bin/env groovy

def call(){
    println "Check values"
    println GlobalVars.commit
    println GlobalVars.tag
    println GlobalVars.repoName
    println GlobalVars.branch
    println GlobalVars.envChain
    println GlobalVars.image
}

//def test(){
    //return "TEST"
//    GlobalVars.commit = "Its global var from script!"

 //   return GlobalVars.commit
//}


