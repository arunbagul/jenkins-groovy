import groovy.json.JsonSlurper 
import groovy.json.JsonOutput

def Map2Json(myAuth) {
    def jsonString = JsonOutput.toJson(myAuth)
    return jsonString
}

/////////////////////////////////////
def OS_USERNAME = System.getenv('OS_USERNAME') ?: 'none'
def OS_PASSWORD = System.getenv('OS_PASSWORD') ?: 'none'

def OSAuth = [
    "provider":"openstack", 
    "region": "regionsName",
    "domain_name":"DomainName", 
    "project_name": "Openstack_ProjectName", 
    "username":"${OS_USERNAME}", 
    "password":"${OS_PASSWORD}" 
  ]

print OSAuth
jsonStr = Map2Json(OSAuth)
print jsonStr
