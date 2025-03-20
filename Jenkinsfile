pipeline {
    agent any

    stages {
        stage('ssh-test') {
            sshagent (credentials: ['githubCD']) {
                // sh 'ssh -o StrictHostKeyChecking=no "uptime"'
                sh 'ssh SYCNS_CONFERENCE@192.168.0.40'
                sh 'DIR'
            }
        }
    }
}