package com.privatelibrarian.app.data.local

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.HnswIndex
import io.objectbox.annotation.Vector

@Entity
data class EmbeddingEntity(
    @Id var id: Long = 0,
    val snippetId: String,
    val documentId: String,
    @HnswIndex // Faster search for large datasets
    @Vector(dimensions = 384) // Dimension for standard small embedding models
    val vector: FloatArray
)
