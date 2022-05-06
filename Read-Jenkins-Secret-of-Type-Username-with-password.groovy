//Read Jenkins Secret of Type "Username with password"
//version 1.0
//Plugin
//credentials-binding ~ https://www.jenkins.io/doc/pipeline/steps/credentials-binding/

node('master') {
	withCredentials([usernamePassword(credentialsId: GIT_TOKEN_JS_ID, usernameVariable: 'gitUserName', passwordVariable: 'github_token')]) {
      println "UserName/Password  from Jenkins Username: ${gitUserName} , Password: ${github_token}"
	}
}
