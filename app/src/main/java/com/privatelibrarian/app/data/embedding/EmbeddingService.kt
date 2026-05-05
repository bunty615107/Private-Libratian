package com.privatelibrarian.app.data.embedding

import android.content.Context
import com.google.mediapipe.tasks.text.textembedder.TextEmbedder
import com.google.mediapipe.tasks.text.textembedder.TextEmbedder.TextEmbedderOptions

class EmbeddingService(private val context: Context) {

    private var textEmbedder: TextEmbedder? = null

    fun initialize(modelPath: String) {
        val options = TextEmbedderOptions.builder()
            .setBaseOptions(
                com.google.mediapipe.tasks.core.BaseOptions.builder()
                    .setModelAssetPath(modelPath)
                    .build()
            )
            .build()
        
        textEmbedder = TextEmbedder.createFromOptions(context, options)
    }

    fun embedText(text: String): FloatArray? {
        val result = textEmbedder?.embed(text)
        return result?.embeddingResult()?.embeddings()?.firstOrNull()?.floatEmbedding()
    }
}
