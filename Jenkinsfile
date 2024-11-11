// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Clone the GitHub repository
                git branch: 'master', url: 'https://github.com/R45Hrishikesh/hello.git'
            }
        }
        stage('Build') {
            steps {
                // Build the project with Maven
                sh 'mvn clean compile'
            }
        }
        stage('Run Application') {
            steps {
                // Run the Java application
                sh 'mvn exec:java -Dexec.mainClass="com.example.HelloWorld"'
            }
        }
    }
}
