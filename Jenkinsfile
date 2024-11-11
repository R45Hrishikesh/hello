pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/R45Hrishikesh/hello.git', branch: 'master', credentialsId: '1d1742e0-33c6-403b-a976-5c78ef92f5d3'
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
