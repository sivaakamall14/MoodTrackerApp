pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sivaakamall14/MoodTrackerApp.git'
            }
        }

        stage('Build Maven (Docker)') {
            steps {
                sh '''
                docker run --rm \
                -v $WORKSPACE/MoodTrackerApp:/app \
                -w /app \
                maven:3.9.6-eclipse-temurin-17 \
                mvn clean package
                '''
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t mood-tracker:1.0 .'
            }
        }

        stage('Show Images') {
            steps {
                sh 'docker images'
            }
        }
    }
}