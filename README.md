<div align="center">

# 📚 Private-Libratian

[![Build Status](https://img.shields.io/github/actions/workflow/status/bunty615107/Private-Libratian/build.yml?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/actions)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/bunty615107/Private-Libratian/blob/main/LICENSE)
[![Stars](https://img.shields.io/github/stars/bunty615107/Private-Libratian?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/stargazers)
[![Forks](https://img.shields.io/github/forks/bunty615107/Private-Libratian?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/network/members)

[![GitHub Release](https://img.shields.io/github/v/release/bunty615107/Private-Libratian?style=flat-square)](https://github.com/bunty615107/Private-Libratian/releases)
[![F-Droid](https://img.shields.io/badge/F--Droid-Get_it_on-blue?logo=f-droid&style=flat-square)](https://f-droid.org/packages/com.privatelibrarian.app/)

**A privacy-first, on-device AI assistant for Android that indexes your local documents and provides natural-language answers using Gemma 4.**

</div>

---

## 📖 About the Project

**Private-Libratian** is your personal, on-device document assistant. Designed with strict privacy in mind, it scans and indexes your local files—such as PDFs, images, and text notes—without ever sending your sensitive data to the cloud. By leveraging the power of **Gemma 4**, it allows you to ask natural language questions and get immediate, context-aware answers directly from your documents.

Whether you're a researcher needing quick facts from a pile of PDFs, a student looking through notes, or a professional retrieving information from local files, Private-Libratian keeps your data completely secure while providing cutting-edge AI capabilities.

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

## ✨ Key Features

- 🔒 **100% Offline & Private:** No documents or embeddings ever leave your device. Your data stays yours, ensuring maximum security and privacy.
- 🔍 **Semantic Search Engine:** Powered by **ObjectBox Vector DB** for lightning-fast, high-dimensional vector retrieval.
- 🧠 **Local LLM Intelligence:** Uses **Gemma 4** (4-bit quantized) via MediaPipe for powerful, accurate natural language processing.
- ⚙️ **Automated Background Indexing:** Features intelligent background scanning with **WorkManager**, optimized to preserve your device's battery life and performance.
- 🎨 **Search-First UI:** A clean, minimalist Material 3 interface built completely from the ground up with Jetpack Compose.

---

## 🛠️ Tech Stack

- **UI Framework:** Kotlin, Jetpack Compose, Material 3
- **App Logic:** Kotlin Coroutines & Flow
- **Metadata Storage:** Room (SQLite)
- **Vector Database:** ObjectBox (HNSW Vector Search)
- **AI / Inference:** MediaPipe LLM Inference Engine (Gemma 4)
- **DevOps / CI:** Gradle (8.4), Android Gradle Plugin 8.1.1, Jenkins CI/CD, GitHub Actions

---

## ✅ Prerequisites

Before you begin, ensure you have met the following requirements:
- **Android Studio:** Iguana (or newer).
- **Android Device:** An Android device running Android 8.0 (API 26) or higher.
- **Knowledge:** Basic knowledge of Gradle and Android development.
- **Model Weights:** You will need to download the 4-bit quantized **Gemma 4 weights** (E2B/E4B) for the LLM Inference Engine to work.

---

## 🚀 Installation

Follow these step-by-step instructions to get your development environment set up:

### 1. Clone the Repository
```bash
git clone https://github.com/bunty615107/Private-Libratian.git
cd Private-Libratian
```

### 2. Download Model Weights
- Obtain the Gemma 4 E2B/E4B 4-bit quantized weights.
- Place the downloaded weight files into the following directory:
  ```text
  app/src/main/assets/
  ```

### 3. Build the Project
- Open the project in Android Studio and let Gradle sync.
- Alternatively, build from the command line (ensure `gradlew` is executable by running `chmod +x gradlew`):
  ```bash
  # Note: If building with JDK 21+, you may need to provide --add-exports JVM arguments
  ./gradlew assembleDebug
  ```

### 4. Install and Run
- Install the APK on your device.
- **Important:** On the first run, grant file access permissions to allow the indexing engine to scan your designated folders.

---

## 💡 Usage Examples

Private-Libratian is designed to be intuitive and straightforward. Here is how you can get the most out of it:

### 1. Indexing Your Documents
Upon granting permissions, the app will start scanning your local directories. You can monitor the progress directly in the notification shade or within the app's status view.

<div align="center">
  <img src="https://via.placeholder.com/800x400?text=Screenshot:+Indexing+Documents+Progress" alt="Indexing Progress Placeholder" width="80%">
</div>

### 2. Asking Questions
Simply type your question in the search bar. The app will semantically search through your indexed documents and generate a coherent answer using the local LLM.

<div align="center">
  <img src="https://via.placeholder.com/800x400?text=Screenshot:+Asking+Questions+and+Receiving+Answers" alt="Answering Questions Placeholder" width="80%">
</div>

---

## 🔌 API Documentation

*As this is primarily an on-device Android application, there are no external REST APIs.*

However, if you are looking to interact with the core engine components programmatically within the app's architecture:
- **`IndexManager`**: Handles triggering of background scanning jobs via WorkManager.
- **`VectorSearchRepository`**: Manages queries and insertions to the ObjectBox Vector DB.
- **`LLMInferenceService`**: Wraps MediaPipe calls to interact with the Gemma 4 model for local text generation.

*(For detailed method signatures, please refer to the inline KotlinDoc within the source code.)*

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. **Fork the Project**
2. **Create your Feature Branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your Changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the Branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

*Tip: A helper script is included to push to the remote repository. Ensure Git is initialized before running:*
```powershell
.\push_to_github.ps1 -RepoUrl "https://github.com/bunty615107/Private-Libratian.git"
```

For more details, please see our [Contributing Guidelines](CONTRIBUTING.md) and [Code of Conduct](CODE_OF_CONDUCT.md).

---

## 🌍 Community & Promotion

- Check out our [Promotion Guide](PROMOTION.md) for templates on how to share Private-Libratian on Reddit, XDA, dev.to, and more!
- View our [Changelog](CHANGELOG.md) for the latest updates and release history.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 💬 Contact & Support

If you have any questions, suggestions, or need help with Private-Libratian:

- **Issue Tracker:** [GitHub Issues](https://github.com/bunty615107/Private-Libratian/issues)
- **Repository:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

---
<div align="center">
  <i>Built with ❤️ for privacy and local-first AI.</i>
</div>
