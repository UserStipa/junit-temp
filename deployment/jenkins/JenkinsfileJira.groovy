pipeline {
    agent {
        node {
            label 'zakroma-ui-machine'
        }
    }
    stages {
        stage('Git') {
            steps {
                git branch: 'master', url: 'https://github.com/UserStipa/junit-temp.git'
            }
        }
        stage('Run Tests') {
            steps {
                withMaven(maven: 'Maven 3.6.1') {
                    sh """mvn test -o"""
                }
            }
        }
    }
}