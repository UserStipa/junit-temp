pipeline {
    agent any
    stages {
        stage('Git') {
            steps {
                git branch: 'master', url: 'https://github.com/UserStipa/junit-temp.git'
            }
        }
        stage('Run Tests') {
            steps {
                sh """./mvnw test"""
            }
        }
    }
}