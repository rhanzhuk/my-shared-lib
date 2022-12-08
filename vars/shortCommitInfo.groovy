//Получение короткого коммита (для дисплея в дженкинсе)
//#!/usr/bin/env groovy
def setCommitShort(String commit) {
    String result
    if (commit == null) {
        result = "$env.BUILD_NUMBER"
        return result
    } else {
        result = "1." + commit.substring(0,7)
        return result
    }
}
