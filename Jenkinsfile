pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/sivaakamall14/MoodTrackerApp.git'
            }
        }

     stage('Build Project') {
    steps {
        dir('MoodTrackerApp') {
            sh 'docker run --rm -v $(pwd):/app -w /app maven:3.9.6-eclipse-temurin-17 mvn clean package'
        }
    }
}
        stage('List Files (Debug)') {
            steps {
                sh 'ls'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t mood-tracker .'
            }
        }
    }
}