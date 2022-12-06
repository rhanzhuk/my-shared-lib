//Получение короткого коммита (для дисплея в дженкинсе)
#!/usr/bin/env groovy
def call(String commit) {
    def res = commit.substring(0,7)
    return res
}
