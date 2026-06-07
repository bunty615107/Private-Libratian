package com.privatelibrarian.app.data.local

/**
 * ObjectBox vector embedding entity.
 * Currently stubbed — will use ObjectBox annotations when the plugin is re-enabled.
 */
class EmbeddingEntity(
    var id: Long = 0,
    val snippetId: String = "",
    val documentId: String = "",
    val vector: FloatArray = FloatArray(384)
)
