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
               bat 'mvn clean install compile'
            }
        }
        stage('Code Coverage') {
            steps {
               jacoco([$class: 'JacocoPublisher',
                         execPattern: 'target/*.exec',
                         classPattern: 'target/classes',
                         sourcePattern: 'src/main/java',
                         exclusionPattern: 'src/test*'
                   ])
            }
        }
    }
}
