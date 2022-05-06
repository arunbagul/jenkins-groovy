//How to retrieve (recover) secret from "Jenkins Secret"
//version 1.0
//Plugin
//credentials-binding ~ https://www.jenkins.io/doc/pipeline/steps/credentials-binding

node('master') {
	withCredentials([string(credentialsId: 'JS_SECRET_ID' , variable: 'password_from_js')]) {
	 shell_output = sh(script: """  echo ${password_from_js} > write_to_file """, returnStdout: true ).trim()
	}        
}
