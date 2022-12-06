#!/usr/bin/env groovy

def initVar(args){
    GlobalVars vars = new GlobalVars()
    vars.setCommit("$env.GIT_PREVIOUS_COMMIT")
    vars.setTag(shortCommitInfo(vars.getCommit()))
}
