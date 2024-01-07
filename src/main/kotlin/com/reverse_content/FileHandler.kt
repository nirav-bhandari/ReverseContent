package com.reverse_content

import java.io.File

class FileHandler {
    fun readFile(filePath: String): String = File(filePath).readText()
    fun writeFile(filePath: String, content: String) = File(filePath).writeText(content)
}