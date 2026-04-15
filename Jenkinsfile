pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sivaakamall14/MoodTrackerApp.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                dir('MoodTrackerApp') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t mood-tracker:1.0 .'
            }
        }

        stage('List Images') {
            steps {
                sh 'docker images'
            }
        }
    }
}