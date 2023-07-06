def job1 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job1.groovy")
def job2 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job2.groovy")
def job3 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job3.groovy")
def job4 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job4-pipeline.groovy")
def job5 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job5.groovy")
def job6 = readFileFromWorkspace("${WORKSPACE}/dsl/src/job6.groovy")

job('job1') {
      job1
}


job('job2') {
      job2
}

pipelineJob('job3'){
    job3
}

job('job5'){
    job5
}



job4

job('job6') {
  description('job6')
  steps {
    shell(job6)
  }
}

// load("${WORKSPACE}/dsl/src/job1.groovy")
// load("${WORKSPACE}/dsl/src/job2.groovy")