 pipeline {
        agent any
        stages{
        stage('Compile Stage') {
        steps{
           withMaven(maven : 'maven 3.6.1'){
           sh 'mvn clean compile'
           }

        }
        }

        stage('Testing Stage') {
                steps{
                   withMaven(maven : 'maven 3.6.1'){
                   sh 'mvn clean compile'
                   }

                }
                }
        stage('Deployment Stage') {
                        steps{
                           withMaven(maven : 'maven 3.6.1'){
                           sh 'mvn clean compile'
                           }

                        }
                        }



        }