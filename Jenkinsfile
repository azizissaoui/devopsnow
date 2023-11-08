pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            steps {
                echo 'pulling..';
                git branch: 'master',
                    url: 'https://github.com/azizissaoui/backend.git'
                    
            }
        
        }
        stage('Clean Project') {
            steps {
                // Perform build steps here, like compiling the code
                sh 'mvn clean'
            }
        }
        stage('Build') {
            steps {
               
                sh 'mvn install'
            }
        }
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }

       
       
       

       stage('mvn SonarQube') {
    		steps {
        		script {
            

          
                sh "mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://192.168.107.131:9000 -Dsonar.login=1aaa8e955c2be3d0071a94929ff4172e42a23075"
                        }
                    }

stage('Run Unit Tests') {
            steps {
              sh 'mvn test'
             
               
            }
               
            }


         stage('Nexus') {
            steps {
              sh 'mvn deploy'
             
               
            }
               
            }



         
         
    } 
}
}
