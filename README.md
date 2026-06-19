# Private Librarian

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A privacy-first, on-device AI assistant for Android that indexes your local documents (PDFs, images, notes) and provides natural-language answers using **Gemma 4**.

## 🚀 Features
- **100% Offline**: No documents or embeddings ever leave your device.
- **Semantic Search**: Powered by **ObjectBox Vector DB** for fast, high-dimensional retrieval.
- **Local LLM**: Uses **Gemma 4** (4-bit quantized) via MediaPipe for intelligence.
- **Automated Indexing**: Background scanning with **WorkManager**, optimized for battery and performance.
- **Search-First UI**: Minimalist Material 3 interface built with Jetpack Compose.

## 🛠️ Tech Stack
- **UI**: Kotlin + Jetpack Compose + Material 3
- **Logic**: Coroutines & Flow
- **Metadata**: Room (SQLite)
- **Vectors**: ObjectBox (HNSW Vector Search)
- **AI**: MediaPipe LLM Inference (Gemma 4)
- **DevOps**: Jenkins CI/CD

## 📦 Getting Started
1. **Model Weights**: Download Gemma 4 E2B/E4B weights and place them in `app/src/main/assets/`.
2. **Build**: Run `./gradlew assembleDebug` or use the provided **Jenkinsfile**.
3. **Setup**: Grant file access permissions on the first run to allow the indexing engine to scan your folders.

## 🤝 Contributing
Initialize Git and use the helper script to push to your remote:
```powershell
.\push_to_github.ps1 -RepoUrl "https://github.com/bunty615107/Private-Libratian.git"
```

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
