pipeline {
   agent any
   environment 
   { 
       GitHubUser = credentials('git')  
   }
   stage('Checkout')
   {
   steps
   {  
      git credentialsId: 'git', url: 'git@github.com:vishwasai/MiniProject.git'
   }
}
