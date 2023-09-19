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
               bat 'mvn -version -clean -build'

            }
        }
    }
}
