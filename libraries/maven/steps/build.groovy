void call(){
    node('slave'){
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
          println "hostname".execute().text   
      }
  }
}
