#!/usr/bin/env groovy

def initVar(){
    GlobalVars.commit = "$env.GIT_COMMIT"
    GlobalVars.branch = "$env.GIT_BRANCH"
    def resCommit = GlobalVars.commit
    GlobalVars.tag = shortCommitInfo.setCommitShort(resCommit)
    GlobalVars.repoName = "hanzhukruslan/$JOB_NAME"
    GlobalVars.image = GlobalVars.repoName + ":" + GlobalVars.tag
}
