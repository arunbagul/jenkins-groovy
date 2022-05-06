//Read Jenkins Secret of Type "Secret text"
//version 1.0
//Plugin
//credentials-binding ~ https://www.jenkins.io/doc/pipeline/steps/credentials-binding/

node('master') {
	withCredentials([string(credentialsId: 'JS_SECRET_ID' , variable: 'password_from_js')]) {
     println "Secret from Jenkins Secret: ${password_from_js}"
	}
}
