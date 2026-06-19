# Private Librarian

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![GitHub Release](https://img.shields.io/github/v/release/bunty615107/Private-Libratian)](https://github.com/bunty615107/Private-Libratian/releases)
[![F-Droid](https://fdroid.gitlab.io/artwork/badge/get-it-on.png)](https://f-droid.org/packages/com.privatelibrarian.app/)
[![CI Build](https://github.com/bunty615107/Private-Libratian/actions/workflows/build.yml/badge.svg)](https://github.com/bunty615107/Private-Libratian/actions/workflows/build.yml)

A privacy-first, on-device AI assistant for Android that indexes your local documents (PDFs, images, notes) and provides natural-language answers using **Gemma 4**.
[![Build Status](https://img.shields.io/github/actions/workflow/status/bunty615107/Private-Libratian/build.yml?style=flat-square)](https://github.com/bunty615107/Private-Libratian/actions)
[![License](https://img.shields.io/github/license/bunty615107/Private-Libratian?style=flat-square)](https://github.com/bunty615107/Private-Libratian/blob/main/LICENSE)
[![Stars](https://img.shields.io/github/stars/bunty615107/Private-Libratian?style=flat-square)](https://github.com/bunty615107/Private-Libratian/stargazers)
[![Forks](https://img.shields.io/github/forks/bunty615107/Private-Libratian?style=flat-square)](https://github.com/bunty615107/Private-Libratian/network/members)

> A privacy-first, on-device AI assistant for Android that indexes your local documents (PDFs, images, notes) and provides natural-language answers using **Gemma 4**.

---

## 📑 Table of Contents
- [About the Project](#-about-the-project)
- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Usage Examples](#-usage-examples)
- [API Documentation](#-api-documentation)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact & Support](#-contact--support)

---

## 📖 About the Project

**Private Librarian** is your personal, on-device document assistant. Designed with privacy in mind, it scans and indexes your local files—like PDFs, images, and text notes—without ever sending your sensitive data to the cloud. By leveraging the power of **Gemma 4**, it allows you to ask natural language questions and get immediate, context-aware answers directly from your documents.

Whether you're a researcher needing quick facts from a pile of PDFs, or a professional retrieving information from local notes, Private Librarian keeps your data secure while providing cutting-edge AI capabilities.

---

## 🚀 Key Features

- **100% Offline & Private:** No documents or embeddings ever leave your device. Your data stays yours.
- **Semantic Search Engine:** Powered by **ObjectBox Vector DB** for fast, high-dimensional retrieval.
- **Local LLM Intelligence:** Uses **Gemma 4** (4-bit quantized) via MediaPipe for powerful natural language processing.
- **Automated Background Indexing:** Features background scanning with **WorkManager**, optimized to preserve battery life and performance.
- **Search-First UI:** A clean, minimalist Material 3 interface built completely with Jetpack Compose.

---

## 🛠️ Tech Stack

- **UI Framework:** Kotlin + Jetpack Compose + Material 3
- **App Logic:** Coroutines & Flow
- **Metadata Storage:** Room (SQLite)
- **Vector Database:** ObjectBox (HNSW Vector Search)
- **AI / Inference:** MediaPipe LLM Inference Engine (Gemma 4)
- **DevOps:** Jenkins CI/CD

---

## ⚙️ Prerequisites

Before you begin, ensure you have met the following requirements:
- Android Studio Iguana (or newer).
- An Android device running Android 8.0 (API 26) or higher.
- Basic knowledge of Gradle and Android development.
- **Gemma 4 Weights**: You will need to download the 4-bit quantized Gemma 4 weights (E2B/E4B).

---

## 📦 Installation

Follow these steps to get your development environment set up:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/bunty615107/Private-Libratian.git
   cd Private-Libratian
   ```

2. **Download Model Weights**
   - Obtain the Gemma 4 E2B/E4B weights.
   - Place the downloaded weight files into the following directory:
     ```
     app/src/main/assets/
     ```

3. **Build the Project**
   - Open the project in Android Studio and let Gradle sync.
   - Alternatively, build from the command line:
     ```bash
     ./gradlew assembleDebug
     ```
   - *Note: A `Jenkinsfile` is also provided for CI/CD automation.*

4. **Install and Run**
   - Install the APK on your device.
   - **Important:** On the first run, grant file access permissions to allow the indexing engine to scan your designated folders.

---

## 💡 Usage Examples

Private Librarian is designed to be intuitive and straightforward. Here are a few examples of how to use it:

### 1. Indexing Your Documents
Upon granting permissions, the app will start scanning your local directories. You can monitor the progress in the notification shade.

![Indexing Progress Placeholder](https://via.placeholder.com/600x300?text=Screenshot:+Indexing+Progress)

### 2. Asking Questions
Simply type your question in the search bar. The app will semantically search through your indexed documents and generate an answer using the local LLM.

![Answering Questions Placeholder](https://via.placeholder.com/600x300?text=Screenshot:+Asking+Questions+and+Receiving+Answers)

---

## 🔌 API Documentation

*As this is primarily an on-device Android application, there are no external REST APIs.*

However, if you are looking to interact with the core engine components programmatically within the app:
- **`IndexManager`**: Handles triggering of background scanning jobs via WorkManager.
- **`VectorSearchRepository`**: Manages queries to the ObjectBox Vector DB.
- **`LLMInferenceService`**: Wraps MediaPipe calls to interact with the Gemma 4 model.

*(For detailed method signatures, please refer to the inline KotlinDoc within the source code.)*

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

*Tip: A helper script is included to push to the remote repository. Ensure Git is initialized before running:*
```powershell
.\push_to_github.ps1 -RepoUrl "https://github.com/bunty615107/Private-Libratian.git"
```

## 🌍 Community & Promotion
- Check out our [Promotion Guide](PROMOTION.md) for templates on how to share Private Librarian on Reddit, XDA, dev.to, and more!
- View our [Changelog](CHANGELOG.md) for the latest updates.

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
