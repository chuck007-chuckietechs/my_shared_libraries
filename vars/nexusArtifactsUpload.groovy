def call() {           
 nexusArtifactUploader artifacts: [[artifactId: 'maven-web-app', classifier: '', file: 'target/maven-web-app.war', type: 'war']], credentialsId: 'Nexus-Credentials', groupId: 'com.chuckSoftwares', nexusUrl: '3.99.154.124:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'chuckietech-snapshot-repo', version: '1.0-SNAPSHOT'
}