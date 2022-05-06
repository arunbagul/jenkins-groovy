//Howto assign Jenkins Secret to global variable
//version 1.0
//Plugin
//credentials-binding ~ https://www.jenkins.io/doc/pipeline/steps/credentials-binding/

//global variable
GIT_TOKEN = ''

//get secret from jenkins-secret
node('master') {
	withCredentials([usernamePassword(credentialsId: GIT_TOKEN_JS_ID, usernameVariable: 'gitUserName',passwordVariable: 'gtoken')]) {
      env.GIT_TOKEN = gtoken
	}
  println "GIT_TOKEN = ${env.GIT_TOKEN}"
}
