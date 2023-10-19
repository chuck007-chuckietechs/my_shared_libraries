def call() {           
  sshagent(['Tomcat-Server-Agent']) {
		sh 'scp -o StrictHostKeyChecking=no target/maven-web-app.war ec2-user@3.96.174.187:/home/ec2-user/apache-tomcat-9.0.82/webapps'
	   }
}