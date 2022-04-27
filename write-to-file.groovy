import java.io.File

def fileExist(myPath) {
    def file = new File(myPath)
    return file.exists()
}

//////////////
File file = new File("/tmp/output.txt")
file.write "First line\n"
file << "Second line\n"

println "File Content: "
println "------------------------------------"
println file.text


println "Appending to file..."
file.append("I will append this line to File\n")

println "File Content: "
println "------------------------------------"
println file.text
