
def call(){
    jobs = jenkins.model.Jenkins.instance.getJobNames()
    fullName = jenkins.model.Jenkins.instance.getFullName()

    println "Number of jobs: " + jobs.size()
    println "\nList of jobs:\n" + jobs.join("\n")
    println "Full name: " + fullName
}
