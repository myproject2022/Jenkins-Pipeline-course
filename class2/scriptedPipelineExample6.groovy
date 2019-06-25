node {
  stage('use passwords') {
    withCredentials([usernamePassword(credentialsId: 'tomcat_user', usernameVariable: 'tomcatuser', passwordVariable: 'tomcatpassword')])
    {
      echo "My tomcat username - '${tomcatuser}'"    
      echo "My tomcat password is - '${tomcatpassword}'"
    }
  }
}
