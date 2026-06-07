package com.privatelibrarian.app.data.llm

import android.content.Context
import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * LLM inference service.
 * Currently stubbed — will use MediaPipe LlmInference with Gemma 4 when model weights are available.
 */
class LlmService(private val context: Context) {

    private var isInitialized = false

    fun initializeModel(modelPath: String) {
        // TODO: Initialize MediaPipe LlmInference when model is available
        // val options = LlmInference.LlmInferenceOptions.builder()
        //     .setModelPath(modelPath).setMaxTokens(512)
        //     .setTopK(40).setTemperature(0.7f).setRandomSeed(101)
        //     .build()
        // llmInference = LlmInference.createFromOptions(context, options)
        Log.d("LlmService", "Stub: would initialize with model at $modelPath")
        isInitialized = true
    }

    fun generateAnswer(prompt: String): Flow<String> = flow {
        if (!isInitialized) {
            emit("Model not initialized. Place Gemma 4 weights in app/src/main/assets/ and restart.")
            return@flow
        }
        // Stub response for now
        emit("Private Librarian is ready. When Gemma 4 model weights are loaded, I will answer using your local documents.")
    }
}
