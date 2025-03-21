pipeline {
    agent any
    tools {
        maven 'maven-3.9.9'
    }
    environment {
        SSH_CONFIG_NAME = 'window_server'
        SRC_FILE = 'target/demo-0.0.1-SNAPSHOT.jar'
        RMV_PREF = 'target'
        RMT_DIR = '/'
    }
    stages {
        stage('Profile Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sshPublisher(
                        failOnError: true,
                        publishers: [
                            sshPublisherDesc(
                                configName: env.SSH_CONFIG_NAME,
                                verbose: true,
                                transfers: [
                                    sshTransfer(
                                        cleanRemote:false,
                                        sourceFiles: env.SRC_FILE,
                                        removePrefix: env.RMV_PREF,
                                        remoteDirectory: env.RMT_DIR,
                                    )
                                ]
                            )
                        ]
                    )
                }
            }
        }
    }
    post {
        cleanup {
            cleanWs()
        }
    }
}