pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                checkout scm
            }
        }
        stage('Build'){
            steps{
               bat 'mvn clean install'
               bat 'mvn test'
            }
        }
    }
}
