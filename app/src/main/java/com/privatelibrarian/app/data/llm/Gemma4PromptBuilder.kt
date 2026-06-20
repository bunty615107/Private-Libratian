package com.privatelibrarian.app.data.llm

class Gemma4PromptBuilder {
    fun buildPrompt(query: String, context: List<String>): String {
        val contextText = context.joinToString("\n            ") { "- $it" }
        
        val template = """
            <start_of_turn>user
            You are a helpful Private Librarian. Answer the question based ONLY on the provided context.
            
            Context:
            {CONTEXT}
            
            Question: {QUERY}
            <end_of_turn>
            <start_of_turn>model
        """.trimIndent()

        return template.replace("{CONTEXT}", contextText).replace("{QUERY}", query)
    }
}
