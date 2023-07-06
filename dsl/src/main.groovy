def job1 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job1.groovy")
def job2 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job2.groovy")


job('job1') {
      script(job1)
}


job('job2') {
      script(job2)
}

// load("${WORKSPACE}/dsl/src/job1.groovy")
// load("${WORKSPACE}/dsl/src/job2.groovy")