pipeline {

    agent any
    tools {
        maven 'Maven'
        jdk 'Java_JDK'
    }
    environment {
        DOCKER_HOME_CREDENTIALS = credentials('docker-hub')
    }
    stages {

        stage("build"){
            steps {
                echo 'building the app'
                sh "mvn clean"
                sh "mvn compile"

            }
        }

        stage("test"){

            steps {
                echo 'testing the app'
                echo "${WORKSPACE}"
                sh "mvn test"
            }
        }

        stage("deploy"){
            when {
                expression {
                    BRANCH_NAME == "main"
                }
            }
            steps {
                echo 'deploying the app'
                sh 'mvn package'
            }
        }
    }
    post {
        success {
            echo 'sucess'
        }
        failure {
            echo 'failure'
        }
    }
}