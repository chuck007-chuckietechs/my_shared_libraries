def call() {           
  sshagent(['Tomcat-Server-Agent']) {
		sh 'scp -o StrictHostKeyChecking=no target/maven-web-app.war ec2-user@99.79.65.109:/home/ec2-user/apache-tomcat-9.0.82/webapps'
	   }
}
