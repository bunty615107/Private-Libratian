# Private Librarian

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-purple.svg)](https://kotlinlang.org/)

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

## 🌍 Community & Promotion
- Check out our [Promotion Guide](PROMOTION.md) for templates on how to share Private Librarian on Reddit, XDA, dev.to, and more!
- View our [Changelog](CHANGELOG.md) for the latest updates.

## 📄 License
Released under the Apache 2.0 License.
