<div align="center">

# 📚 Private-Libratian

[![Build Status](https://img.shields.io/github/actions/workflow/status/bunty615107/Private-Libratian/build.yml?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/actions)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/bunty615107/Private-Libratian/blob/main/LICENSE)
[![Stars](https://img.shields.io/github/stars/bunty615107/Private-Libratian?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/stargazers)
[![Forks](https://img.shields.io/github/forks/bunty615107/Private-Libratian?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/network/members)
[![GitHub Release](https://img.shields.io/github/v/release/bunty615107/Private-Libratian?style=for-the-badge)](https://github.com/bunty615107/Private-Libratian/releases)
[![F-Droid](https://img.shields.io/badge/F--Droid-Get_it_on-blue?logo=f-droid&style=for-the-badge)](https://f-droid.org/packages/com.privatelibrarian.app/)

**A cutting-edge, privacy-first AI assistant designed for Android that securely indexes local files and delivers intelligent, natural-language answers completely offline via Gemma 4.**

</div>

---

## 📖 About the Project

Welcome to **Private-Libratian** – your ultimate personal, on-device document companion. Engineered with uncompromising privacy principles, it autonomously scans and indexes your local documents, PDFs, and notes without a single byte of sensitive data ever leaving your device. By harnessing the robust capabilities of **Gemma 4**, Private-Libratian empowers you to seamlessly query your documents in natural language and receive immediate, contextually precise answers right from your device.

Whether you are a researcher navigating vast archives of PDFs, a student reviewing course materials, or a professional retrieving critical data from local files, Private-Libratian guarantees complete data sovereignty while delivering state-of-the-art AI intelligence.

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

- 🔒 **100% Offline & Private:** Your data remains strictly on your device. No cloud sync, no tracking, pure privacy.
- 🔍 **Semantic Search Engine:** Leverages the raw speed of **ObjectBox Vector DB** to perform high-dimensional semantic search in milliseconds.
- 🧠 **Local LLM Intelligence:** Integrates **Gemma 4** (4-bit quantized) through MediaPipe, delivering accurate and coherent natural language processing on-the-go.
- ⚙️ **Automated Background Indexing:** Utilizes Android's **WorkManager** for efficient, battery-friendly, automated document parsing and indexing in the background.
- 🎨 **Search-First UI:** Boasts a sleek, modern, and highly intuitive Material 3 interface, crafted seamlessly using Jetpack Compose.

---

## 🛠️ Tech Stack

- **UI Framework:** Kotlin, Jetpack Compose, Material 3
- **App Logic:** Kotlin Coroutines & Flow
- **Metadata Storage:** Room Database (SQLite)
- **Vector Database:** ObjectBox (HNSW Vector Search)
- **AI / Inference:** MediaPipe LLM Inference Engine (Gemma 4)
- **DevOps / CI:** Gradle (8.4), Android Gradle Plugin 8.1.1, Jenkins CI/CD, GitHub Actions

---

## ✅ Prerequisites

To successfully build and deploy Private-Libratian, please ensure you have the following ready:
- **Android Studio:** Iguana or higher recommended.
- **Android Device:** A physical device or emulator running Android 8.0 (API level 26) or newer.
- **Java Development Kit (JDK):** JDK 17 is recommended. If using JDK 21 or later, you must supply `--add-exports` arguments for `jdk.compiler` modules in your Gradle setup.
- **Model Weights:** You must procure the **Gemma 4 weights** (E2B/E4B 4-bit quantized) necessary for the on-device inference engine.

---

## 🚀 Installation

Follow these comprehensive steps to configure your local development environment:

### 1. Clone the Repository
Start by cloning the project to your local machine:
```bash
git clone https://github.com/bunty615107/Private-Libratian.git
cd Private-Libratian
```

### 2. Download and Setup Model Weights
- Acquire the required Gemma 4 E2B/E4B 4-bit quantized models.
- Move the model files into the designated assets directory:
  ```text
  app/src/main/assets/
  ```

### 3. Configure Project Properties
Ensure your local `gradle.properties` includes the standard AndroidX configuration:
```properties
android.useAndroidX=true
```

### 4. Build the Project
- Open the repository in Android Studio and trigger a Gradle sync.
- Alternatively, compile the app directly from your terminal. Ensure the wrapper script is executable:
  ```bash
  chmod +x gradlew
  ./gradlew assembleDebug
  ```
  *Note: If you encounter HTTP 429 errors from Maven Central, this is a known external throttling issue. Retry after a few moments.*

### 5. Install and Run
- Deploy the compiled APK onto your Android device.
- **Crucial Step:** Upon first launch, you must grant the requested file access permissions so the app can initiate the local indexing process.

---

## 💡 Usage Examples

Private-Libratian is engineered to be as intuitive as possible. Here is a brief guide to its core functionalities:

### 1. Indexing Your Documents
Once permissions are granted, the background engine will automatically begin scanning and indexing your designated folders. You can track this progress via a persistent notification or in the app's dedicated status screen.

<div align="center">
  <img src="https://via.placeholder.com/800x400?text=Screenshot:+Document+Indexing+in+Progress" alt="Indexing Progress Placeholder" width="80%">
  <br/>
  <i>Placeholder: View of the indexing status.</i>
</div>

### 2. Asking Questions
Navigate to the main search bar and input your query. Private-Libratian will semantically retrieve the most relevant sections of your documents and utilize the local LLM to formulate a precise answer.

<div align="center">
  <img src="https://via.placeholder.com/800x400?text=Screenshot:+Querying+and+AI+Responses" alt="Answering Questions Placeholder" width="80%">
  <br/>
  <i>Placeholder: Asking a question and receiving an on-device answer.</i>
</div>

---

## 🔌 API Documentation

*Because Private-Libratian operates entirely on-device, it does not expose an external REST API.*

However, for developers looking to extend or modify the application, here are the core internal architectural components:
- **`IndexManager`**: Orchestrates background document scanning and parsing workflows via WorkManager.
- **`VectorSearchRepository`**: Manages all high-dimensional vector embeddings, inserts, and query operations interacting with the ObjectBox Vector DB.
- **`LLMInferenceService`**: Serves as the primary bridge to the MediaPipe engine, facilitating local text generation queries against the Gemma 4 model.

*(For exhaustive method descriptions and parameters, please consult the extensive KotlinDoc annotations throughout the source codebase.)*

---

## 🤝 Contributing

We believe in the power of open-source collaboration. Contributions, bug reports, and feature requests are immensely appreciated.

1. **Fork the Project**
2. **Create your Feature Branch** (`git checkout -b feature/IncredibleFeature`)
3. **Commit your Changes** (`git commit -m 'Introduce IncredibleFeature'`)
4. **Push to the Branch** (`git push origin feature/IncredibleFeature`)
5. **Open a Pull Request**

*Pro Tip: For a streamlined remote push, ensure Git is initialized and utilize the provided helper script:*
```powershell
.\push_to_github.ps1 -RepoUrl "https://github.com/bunty615107/Private-Libratian.git"
```

For comprehensive instructions, please refer to our [Contributing Guidelines](CONTRIBUTING.md) and review our [Code of Conduct](CODE_OF_CONDUCT.md).

---

## 🌍 Community & Promotion

- Want to spread the word? Consult our [Promotion Guide](PROMOTION.md) for excellent templates tailored for Reddit, XDA, dev.to, and other platforms!
- Stay up-to-date with the latest enhancements by visiting the [Changelog](CHANGELOG.md).
- Explore our static web deployment on the [GitHub Pages Documentation](https://bunty615107.github.io/Private-Libratian/).

---

## License

This software is distributed under the MIT License. For complete details, see the [LICENSE](LICENSE) file.

---

## 💬 Contact & Support

Should you require assistance, have feedback, or wish to report a bug regarding Private-Libratian, please reach out through the following channels:

- **Issue Tracker:** [Report a bug or request a feature](https://github.com/bunty615107/Private-Libratian/issues)
- **GitHub Repository:** [Private-Libratian Source](https://github.com/bunty615107/Private-Libratian)
- **Author:** [Abhishek Kumar Kushwaha](https://github.com/bunty615107)

---
<div align="center">
  <i>Developed with ❤️, emphasizing absolute privacy and cutting-edge local AI.</i>
</div>
