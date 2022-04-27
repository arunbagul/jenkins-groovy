import java.io.File

def fileExist(myPath) {
    def file = new File(myPath)
    return file.exists()
}

//////////////
def chkPath = "/tmp/arun.txt"
if (fileExist(chkPath)) {
    println "Yes"
} else {
    println "No"
}
