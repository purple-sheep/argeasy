pipeline {
    agent {
        docker { image 'maven:3.6.0-jdk-8-alpine' }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean verify'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}