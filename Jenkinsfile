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
        stage("make container"){
            steps {
                echo 'make container for the app'
                sh "cp ${WORKSPACE}/jenkins-pipeline_main/target/jenkins-pipeline-test-project.war /opt/jboss/standalone/deployment/"
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