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
                script {
                def mavenVersion = sh(script: 'mvn -version', returnStdout: true).trim()
                echo "Maven Version: $mavenVersion"
                }

            }
        }
    }
}
