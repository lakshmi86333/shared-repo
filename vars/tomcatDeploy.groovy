def call(ip,creds,user){
                sshagent(["${creds}"]) {
                sh "scp target/*.war ${user}@${ip}:/opt/tomcat8/webapps"
                sh "ssh ${user}@${ip} /opt/tomcat8/bin/shutdown.sh "
                sh "ssh ${user}@${ip} /opt/tomcat8/bin/startup.sh "
}
}
