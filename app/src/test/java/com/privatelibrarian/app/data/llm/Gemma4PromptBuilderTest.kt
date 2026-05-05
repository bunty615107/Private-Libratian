package com.privatelibrarian.app.data.llm

import org.junit.Assert.assertEquals
import org.junit.Test

class Gemma4PromptBuilderTest {

    private val builder = Gemma4PromptBuilder()

    @Test
    fun `buildPrompt formats correctly for Gemma 4`() {
        val query = "What is the capital of France?"
        val context = listOf("Paris is the capital of France.", "France is in Europe.")
        
        val expected = """
            <start_of_turn>user
            You are a helpful Private Librarian. Answer the question based ONLY on the provided context.
            
            Context:
            - Paris is the capital of France.
            - France is in Europe.
            
            Question: What is the capital of France?
            <end_of_turn>
            <start_of_turn>model
        """.trimIndent()
        
        val actual = builder.buildPrompt(query, context)
        assertEquals(expected, actual)
    }
}
