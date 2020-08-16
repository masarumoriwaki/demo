node('maven-build-slave') {
  stage('Poll') {
    checkout scm
  }
  stage('Build & Unit test'){
    sh 'mvn clean verify -DskipITs=true';
    junit '**/target/surefire-reports/TEST-*.xml'
    archiveArtifacts artifacts: 'target/*.jar'
    sh 'ls';
    sh 'ls target/';
  }
  

  stage ('Publish'){
    def server = Artifactory.server 'default artifactory'
    def uploadSpec = """{
      "files": [
        {
          "pattern": "target/demo-0.0.1.jar",
          "target": "demo-project/${BUILD_NUMBER}/"
        }
      ]
    }"""
    server.upload spec: uploadSpec
  }
}
