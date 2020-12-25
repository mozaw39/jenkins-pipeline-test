pipeline {

    agent any

    stages {

        stage("build"){
            when {
                expression {
                    CODE_CHANGES == true
                }
            }
            steps {
                echo 'building the app'
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