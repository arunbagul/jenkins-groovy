import java.io.File

def myPath = '/tmp/arun.txt'

def file = new File(myPath)

println "File?: ${file.isFile()}" 
println "Directory?: ${file.isDirectory()}" 
