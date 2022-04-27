// how to use functions in groovy
// return values

def methodName(param1) { 
   //Method code 
   print "Method->" + param1

}

def FunctionName(param1, param2) { 
   //Method code 
   print "\nMethod-(1)->" + param1
   print "\nMethod-(2)->" + param2
   return "return from string"
}

def Function2return_2Vaules() {
  return [true, "second return"]
}

methodName("Welcome to Groovy function")

myStr = FunctionName("Arun", "Bagul")
print myStr + "\n"

def (myStatus, myValue) = Function2return_2Vaules()
print "\nmyStatus==>" + myStatus
print "\nmyValue==>" + myValue
