# Data Models - Private Librarian

## Core Entities

### Document
```kotlin
data class Document(
    val id: String, // UUID or hashed file path
    val title: String,
    val filePath: String,
    val type: DocumentType, // PDF, IMAGE, NOTE
    val size: Long,
    val lastModified: Long,
    val indexingState: IndexingState,
    val tags: List<String> = emptyList()
)

enum class DocumentType { PDF, IMAGE, NOTE }
enum class IndexingState { PENDING, IN_PROGRESS, COMPLETED, FAILED }
```

### Snippet (Chunk)
```kotlin
data class Snippet(
    val id: String,
    val documentId: String,
    val content: String,
    val pageNumber: Int? = null,
    val metadata: Map<String, String> = emptyMap()
)
```

### Embedding (ObjectBox Collection)
```kotlin
@Entity
data class Embedding(
    @Id var id: Long = 0,
    val snippetId: String,
    val documentId: String,
    @Vector(dimensions = 384) // Example dimension for small models
    val vector: FloatArray
)
```

### Answer
```kotlin
data class Answer(
    val query: String,
    val text: String,
    val sourceSnippets: List<Snippet>,
    val timestamp: Long = System.currentTimeMillis()
)
```
