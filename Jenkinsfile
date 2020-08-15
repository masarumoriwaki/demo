node('maven-build-slave-0.2') {
  stage('Poll') {
    checkout scm
  }
  stage('Build & Unit test'){
    sh 'mvn clean verify -DskipITs=true';
    junit '**/target/surefire-reports/TEST-*.xml'
    archive 'target/*.jar'
  }
  

  stage ('Publish'){
    def server = Artifactory.server 'default artifactory'
    def uploadSpec = """{
      "files": [
        {
          "pattern": "target/demo-0.0.1.jar",
          "target": "demo-project/",
          "props": "Integration-Tested=No;Performance-Tested=No"
        }
      ]
    }"""
    server.upload spec: uploadSpec
  }
}
