void call(){
  stage("a"){
    println("build maven project")
  }
  stage("b"){
    println("bbbb")
  }
  stage("c"){
    println("cccc")
  }
  stage("d"){

    node { label 'slave'}

    sh "ls -l && hostname"
  }
}
