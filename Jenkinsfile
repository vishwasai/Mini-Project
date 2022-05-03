pipeline {
   agent any
   environment 
   { 
       // replace xyz with the copy pasted iD
       GitHubUser = credentials('xyz')  
   }
   stage('Checkout')
   {
   steps
   {  
      git credentialsId: 'git', url: 'git@github.com:vishwasai/MiniProject.git'
   }
}
