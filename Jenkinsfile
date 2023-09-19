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


        stage('Test') {
            steps {
                // Run your tests with JaCoCo enabled
                bat 'mvn jacoco:prepare-agent test jacoco:report' // Use 'bat' for Windows batch command
            }
        }

        stage('Publish Code Coverage') {
            steps {
                script {
                    // Adjust the path to your JaCoCo report directory if needed
                    def jacocoReportDir = "${workspace}/target/site/jacoco/"

                    // Publish JaCoCo code coverage report as a Jenkins artifact
                    publishHTML(target: [
                        allowMissing: false,
                        alwaysLinkToLastBuild: true,
                        keepAll: true,
                        reportDir: '${workspace}/site',
                        reportFiles: 'index.html',
                        reportName: 'JaCoCo Code Coverage'
                    ])
                }
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
