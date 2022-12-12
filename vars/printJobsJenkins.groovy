
def call(){
    jobs = jenkins.model.Jenkins.instance.getJobNames()

    println "Number of jobs: " + jobs.size()
    println "\nList of jobs:\n" + jobs.join("\n")
}
