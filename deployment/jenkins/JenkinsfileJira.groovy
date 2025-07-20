pipeline {
    agent {
        node {
            label 'zakroma-ui-machine'
        }
    }
    stages {
        stage('Run Tests') {
            steps {
                withMaven(maven: 'Maven 3.6.1') {
                    sh """mvn test"""
                }
            }
        }
    }
}