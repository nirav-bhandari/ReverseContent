package org.example

class FileReverser(private val fileHandler: FileHandler, private val contentReverser: ContentReverser) {
    fun reverseFileContents(inputFile: String, outputFile: String) {
        val content = fileHandler.readFile(inputFile)
        println("Input -> $content")
        val reversedContent = contentReverser.reverse(content)
        println("Output -> $reversedContent")
        fileHandler.writeFile(outputFile, reversedContent)
    }
}