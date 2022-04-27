import java.io.File

def fileExist(myPath) {
    def file = new File(myPath)
    return file.exists()
}

//////////////
def filePath = "/tmp/arun.txt"
if (fileExist(filePath)) {
    println "Yes"
    //String fileContents = new File(filePath).text
    String fileContents = new File(filePath).getText('UTF-8')

    // Option-1
    // Read File Content as String in variable
    println "--------------------- File Content -----------------------"
    println fileContents
    println "--------------------------------------------"

    // Options-2
    // Read file as Array of String using File.collect
    def list = new File(filePath).collect {it}
    println "--------------------- File Content -----------------------"
    println list
    println "--------------------------------------------"

    // Options-3
    // Read file as Array of String using as Operator
    def array = new File(filePath) as String[]
    println "--------------------- File Content -----------------------"
    println array
    println "--------------------------------------------"

    def file = new File(filePath)
    println "The file ${file.absolutePath} has ${file.length()} bytes"


} else {
    println "File Not Found"
}
