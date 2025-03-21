pipeline {
    agent any
    tools {
        maven 'maven-3.9.9'
    }
    stages {
        stage('ssh-test') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
    post {
        cleanup {
            cleanWs()
        }
    }
}