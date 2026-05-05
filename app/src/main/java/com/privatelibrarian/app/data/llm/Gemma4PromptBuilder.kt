package com.privatelibrarian.app.data.llm

class Gemma4PromptBuilder {
    fun buildPrompt(query: String, context: List<String>): String {
        val contextText = context.joinToString("\n") { "- $it" }
        
        return """
            <start_of_turn>user
            You are a helpful Private Librarian. Answer the question based ONLY on the provided context.
            
            Context:
            $contextText
            
            Question: $query
            <end_of_turn>
            <start_of_turn>model
        """.trimIndent()
    }
}
