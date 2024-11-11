pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/R45Hrishikesh/hello.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Run Application') {
            steps {
                bat 'java -jar target/hello-world-1.0-SNAPSHOT.jar'
            }
        }
    }
}
