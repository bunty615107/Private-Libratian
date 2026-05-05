# Architecture Overview - Private Librarian

## Layers

1.  **Presentation (UI)**
    *   **Technologies:** Jetpack Compose, Material 3.
    *   **Pattern:** MVVM (Model-View-ViewModel).
    *   **Components:** `HomeView`, `SearchView`, `SettingsView`, `ResultCard`.

2.  **Domain (Business Logic)**
    *   **Use Cases:** `IndexDocument`, `SearchDocuments`, `GetAnswerFromLLM`, `SyncEmbeddings`.
    *   **Models:** `Document`, `Snippet`, `Answer`.

3.  **Data (Storage & External APIs)**
    *   **Metadata Store:** Room (SQLite).
    *   **Vector Store:** ObjectBox Vector DB.
    *   **File Access:** Scoped Storage, PDFBox, ML Kit.
    *   **LLM Runtime:** MediaPipe LLM Inference API with Gemma 4 (4-bit quantized).

## Data Flow

### Indexing Flow
1. `DocumentScanner` (WorkManager) -> Scans local folders.
2. `PDFParser` / `OCRProcessor` -> Extracts text.
3. `TextSplitter` -> Creates chunks/snippets.
4. `EmbeddingModel` -> Generates vectors.
5. `ObjectBox` -> Saves vectors + `Room` -> Saves metadata.

### Query/RAG Flow
1. User Query -> `EmbeddingModel` -> Query Vector.
2. `ObjectBox` -> Semantic Search (top K snippets).
3. `PromptBuilder` -> Combines query + context for Gemma 4.
4. `LLMRuntime` (MediaPipe) -> Generates response using Gemma 4.
5. `UI` -> Streams tokenized answer.
