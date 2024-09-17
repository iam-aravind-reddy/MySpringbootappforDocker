pipeline{
    agent any
    tools{
        maven 'MAVEN3'
    }
    stages{
        stage('Checkout Code from GIT'){
            steps{
                git branch: 'main', credentialsId: 'GIT-Creds', url: 'https://github.com/Aravind-pendyala24/MySpringbootapp.git'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t aravind0111/simpleapp .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerpwd')]){
                        sh 'docker login -u aravind0111 -p ${dockerpwd}'
                        sh 'docker push aravind0111/simpleapp'
                    }
                }
            }
        }
    }
}
