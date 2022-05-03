pipeline {
   agent any 
   stages
   {
      stage('credential')
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
   }
}
