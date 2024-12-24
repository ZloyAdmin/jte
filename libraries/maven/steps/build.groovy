void call(){
  agent{ label 'slave'}

  stage("a"){
    println("build maven project")
  }
  stage("b"){
    println("bbbb")
  }
  stage("c"){
    println("cccc")
  }
}
