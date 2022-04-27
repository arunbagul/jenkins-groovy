import groovy.json.JsonSlurper

def InstanceName = "xxxxxxx"

def jsonString = """
    {
        "name": "nginx",
        "run_list": ["recipe[nginx::default]"],
        "chef_attributes": {
            "nginx": {
                "action": "update" 
            }
        },
        "instance_name": "${InstanceName}",
    }
"""

print jsonString

def jsonSlurper = new JsonSlurper()
def myHsh = jsonSlurper.parseText(jsonString)

print myHsh
