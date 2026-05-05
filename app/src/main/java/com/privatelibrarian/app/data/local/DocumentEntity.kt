package com.privatelibrarian.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.privatelibrarian.app.domain.model.DocumentType
import com.privatelibrarian.app.domain.model.IndexingState

@Entity(tableName = "documents")
data class DocumentEntity(
    @PrimaryKey val id: String,
    val title: String,
    val filePath: String,
    val type: String, // Stored as string for simplicity in Room
    val size: Long,
    val lastModified: Long,
    val indexingState: String,
    val tags: String // Comma separated tags
)
