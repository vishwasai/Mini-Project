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
      bat "git clone http://$GitHubUser_USR:$GitHubUser_PSW@example.com/project.git"
   }
}
