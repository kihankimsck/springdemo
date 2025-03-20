pipeline {
    agent any

    stages {
        stage('ssh-test') {
            script {
                sh '''
                    ssh SYCNS_CONFERENCE@192.168.0.40
                '''
            }
        }
    }
}