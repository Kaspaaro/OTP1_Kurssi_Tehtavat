pipeline {
    agent any

    tools {
        // Define your build tool here if needed
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                checkout scm
            }
        }
        stage('Build'){
            steps{
               bat 'mvn -version'
               bat 'mvn -clean install'
               bat 'mvn -build'

            }
        }
        stage('Code Coverage') {

            steps {
                jacoco(execPattern: '**/target/*.exec')
                publishHTML(target: [reportDir: 'target/site/jacoco', reportFiles: 'index.html', reportName: 'JaCoCo Code Coverage Report'], allowMissing: true)
            }
    }
}
