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

        stage('Build') {
            steps {
                // Build your project, compile code, etc.
                sh 'mvn clean package' // Assuming a Maven project, adjust for your build tool
            }
        }

        stage('Test') {
            steps {
                // Run your tests with JaCoCo enabled
                sh 'mvn jacoco:prepare-agent test jacoco:report' // Adjust for your build tool and testing framework
            }
        }

        stage('Publish Code Coverage') {
            steps {
                // Publish JaCoCo code coverage report as a Jenkins artifact
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/jacoco/',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Code Coverage'
                ])
            }
        }
    }

    post {
        always {
            // Archive your build artifacts, send notifications, etc.
            archiveArtifacts 'target/*.jar'
        }
    }
}
