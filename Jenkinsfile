pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }
    environment {
        JAR_FILENAME = "math-service"
        JAR_VERSION = "0.0.1-SNAPSHOT"
        PARAM1 = "Aadesh Chopade"
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }

       

    }
     post {
        always {
            echo "This will always be executed"
        }
        success {
            echo "This will be executed only when all stages succeed"
            junit '**/*xml'
            

        }
        failure {
            echo "This will be executed whenever any stage fails"
        }
    }
}