package org.example

import com.reverse_content.ContentReverser
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContentReverserTest {
    @Test
    fun testReverse() {
        val inputContent = "ABC"
        val expectedOutput = "CBA"

        val result = ContentReverser().reverse(inputContent)
        assertEquals(expectedOutput, result)
    }
}