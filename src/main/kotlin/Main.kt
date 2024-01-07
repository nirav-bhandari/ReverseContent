import com.reverse_content.*

fun main() {
    val inputFile = "input.txt"
    val outputFile = "output.txt"

    val fileReverser = FileReverser(FileHandler(), ContentReverser())
    fileReverser.reverseFileContents(inputFile, outputFile)
}