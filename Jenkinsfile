pipeline {

    agent any

    stages {

        stage("build"){

            steps {
                echo 'building the app'
            }
        }

        stage("test"){

            steps {
                echo 'testing the app'
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
        always {
        }
        success {
            echo 'sucess'
        }
        failure {
            echo 'failure'
        }
    }
}