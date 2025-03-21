pipeline {
    agent any
    tools {
        maven 'maven-3.9.9'
    }
    stages {
        stage('ssh-test') {
            steps {
                sh '''
                    ssh SYCNS_CONFERENCE@192.168.0.40
                '''
            }
        }
    }
    post {
        cleanup {
            cleanWs()
        }
    }
}