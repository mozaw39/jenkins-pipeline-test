pipeline {

    agent any
    tools {
        maven 'Maven'
        jdk 'Java_JDK'
    }
    stages {

        stage("build"){
            steps {
                echo 'building the app'
                sh "mvn clean"
                 sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }

        stage("test"){

            steps {
                echo 'testing the app'
                echo WORKSPACE
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