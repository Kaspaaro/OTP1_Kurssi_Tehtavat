pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                
            }
        }
        
        stage('Test') {
            steps {
               
            }
        }
        
        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:report' // This generates the JaCoCo report
            }
            post {
                always {
                    // Archive and publish the coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}