package com.privatelibrarian.app.domain.repository

import com.privatelibrarian.app.data.local.EmbeddingEntity
import com.privatelibrarian.app.data.local.ObjectBoxManager
import com.privatelibrarian.app.data.embedding.EmbeddingService
import com.privatelibrarian.app.data.llm.LlmService
import com.privatelibrarian.app.data.llm.Gemma4PromptBuilder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.catch

sealed class SearchResult {
    data class Success(val answer: String) : SearchResult()
    data class Error(val message: String) : SearchResult()
    object Loading : SearchResult()
}

class SearchRepository(
    private val embeddingService: EmbeddingService,
    private val llmService: LlmService,
    private val promptBuilder: Gemma4PromptBuilder
) {
    fun askQuestion(query: String): Flow<SearchResult> = flow {
        emit(SearchResult.Loading)
        
        // 1. Generate embedding for query
        val queryVector = embeddingService.embedText(query) 
            ?: throw Exception("Failed to generate embedding")
        
        // 2. Search ObjectBox for context
        val box = ObjectBoxManager.boxStore.boxFor(EmbeddingEntity::class.java)
        // val results = box.query(EmbeddingEntity_.vector.nearestNeighbors(queryVector, 5)).build().find()
        val results = emptyList<EmbeddingEntity>() 

        // 3. Extract context text
        val context = if (results.isEmpty()) {
            listOf("No specific context found. Answer using general knowledge.")
        } else {
            results.map { "Snippet from doc ${it.documentId}" }
        }

        // 4. Build prompt for Gemma 4
        val prompt = promptBuilder.buildPrompt(query, context)

        // 5. Stream answer
        llmService.generateAnswer(prompt).collect { answerChunk ->
            emit(SearchResult.Success(answerChunk))
        }
    }.catch { e ->
        emit(SearchResult.Error(e.message ?: "Unknown error occurred"))
    }
}
