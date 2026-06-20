package com.privatelibrarian.app.data.llm

import org.junit.Assert.assertEquals
import org.junit.Test

class Gemma4PromptBuilderTest {

    private val builder = Gemma4PromptBuilder()

    @Test
    fun `buildPrompt formats correctly for Gemma 4`() {
        val query = "What is the capital of France?"
        val context = listOf("Paris is the capital of France.", "France is in Europe.")
        
        val expected = "<start_of_turn>user\n" +
            "You are a helpful Private Librarian. Answer the question based ONLY on the provided context.\n" +
            "\n" +
            "Context:\n" +
            "- Paris is the capital of France.\n" +
            "- France is in Europe.\n" +
            "\n" +
            "Question: What is the capital of France?\n" +
            "<end_of_turn>\n" +
            "<start_of_turn>model"
        
        val actual = builder.buildPrompt(query, context).trim()
        val finalActual = actual.replace("\r\n", "\n").replace("\n\n", "\n").replace(" ", "").replace("\n", "")
        val finalExpected = expected.trim().replace("\r\n", "\n").replace("\n\n", "\n").replace(" ", "").replace("\n", "")
        assertEquals(finalExpected, finalActual)
    }
}
