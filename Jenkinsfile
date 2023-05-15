pipeline{
    agent any
    
    stages{
        stage('SAHILBUILD'){
            steps{
               build job:'orange_git'
            }
        }
        
        stage('ASHREYBUILD'){
            steps{
               build job:'AshreyBuild'
            }
        }
        
        stage('NOORBUILD'){
            steps{
                build job:'NoorBuild'
            }
        }
    }
}