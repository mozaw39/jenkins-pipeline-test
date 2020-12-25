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
                sh "mvn verify"
                 sh 'mvn package'
            }
        }

        stage("test"){

            steps {
                echo 'testing the app'
                echo "${WORKSPACE}"
            }
        }

        stage("deploy"){
            when {
                expression {
                    BRANCH_NAME == "none"
                }
            }
            steps {
                echo 'deploying the app'
            }
        }
       stage('Push image') {
            docker.withRegistry('https://registry.hub.docker.com', 'git') {
                app.push("${env.BUILD_NUMBER}")
                app.push("latest")
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