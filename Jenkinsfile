pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git(url: 'https://github.com/R45Hrishikesh/hello.git', branch: 'master', credentialsId: '9de5c4e1-2576-4bba-a173-ab8b10e7c26b')

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
