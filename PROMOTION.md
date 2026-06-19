# Private Librarian Promotion Guide

This document contains templates and instructions to help promote the Private Librarian repository to the open-source and Android communities.

## 1. Reddit Submission Templates

### For r/androidapps

**Title:** [DEV] Private Librarian: A 100% Offline, Privacy-First AI Assistant for Your Local Documents

**Body:**

Hi r/androidapps!

I wanted to share a project I've been working on called **Private Librarian**. It's a privacy-first AI assistant for Android that indexes your local documents (PDFs, images, notes) and lets you query them using natural language.

**Why I built it:** I was tired of uploading my private documents to cloud services just to get some AI magic. I wanted an on-device solution that guarantees privacy.

**Key Features:**

*   **100% Offline & Private:** No documents or embeddings ever leave your device.
*   **Powered by Gemma 4:** Uses a 4-bit quantized Gemma 4 model via MediaPipe for powerful local inference.
*   **Semantic Search:** Fast retrieval powered by ObjectBox Vector DB.
*   **Battery Friendly:** Background scanning happens efficiently using WorkManager.
*   **Clean UI:** Minimalist Material 3 design built with Jetpack Compose.

It's completely open-source. If you value privacy and on-device AI, give it a try! I’d love to hear your feedback or feature requests.

**GitHub Repository:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

---

### For r/opensource

**Title:** [Show r/opensource] Private Librarian - An on-device, privacy-first Android AI assistant (Gemma 4)

**Body:**

Hey everyone,

I recently open-sourced **Private Librarian**, an Android app that acts as an intelligent assistant for your local files (PDFs, text, notes) without needing any cloud processing.

It uses **Gemma 4** (running locally via MediaPipe) and **ObjectBox Vector DB** for semantic search. Everything happens on your device, ensuring 100% privacy.

Tech Stack highlights: Kotlin, Jetpack Compose, Coroutines, Room, ObjectBox Vector DB, MediaPipe LLM.

If you are interested in on-device AI, mobile development, or privacy-focused tools, I'd appreciate it if you checked out the repo. Contributions and feedback are very welcome!

**Link:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

---

### For r/selfhosted

*(Note: While not exactly a server self-hosting app, it fits the "control your own data" ethos of the community. Frame it accordingly).*

**Title:** Private Librarian: An open-source Android app for "self-hosting" AI document search directly on your phone

**Body:**

Hi r/selfhosted,

While this isn't a docker container you spin up on your NAS, I thought this community might appreciate the ethos behind **Private Librarian**. It's an Android app that indexes and searches your local documents using AI, completely offline.

Instead of sending your PDFs and notes to a third-party API, the app runs a **Gemma 4** model locally on your phone (using MediaPipe) and stores vector embeddings locally using **ObjectBox Vector DB**.

It guarantees that your data stays on your device.

If you are trying to de-cloud your life and keep your data local, check it out. It's completely open-source under the Apache 2.0 license.

**GitHub Repository:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

## 2. Dev.to Article Outline Template

**Title:** Building a 100% Offline AI Assistant for Android with Gemma 4 and Jetpack Compose

**Outline:**

1.  **Introduction**
    *   The problem: We love AI document search (like ChatPDF), but hate giving up our private data to the cloud.
    *   The solution: Introduce Private Librarian – a privacy-first, fully local Android app.
2.  **Architecture & Tech Stack overview**
    *   Why Kotlin & Jetpack Compose?
    *   The challenges of on-device AI on Android.
3.  **Deep Dive: The AI Brain (Gemma 4 & MediaPipe)**
    *   How to integrate MediaPipe LLM Inference.
    *   Using the 4-bit quantized Gemma 4 model to balance performance and memory.
4.  **Deep Dive: Semantic Search (ObjectBox)**
    *   Explain vector embeddings briefly.
    *   Why ObjectBox Vector DB was chosen for fast, local, high-dimensional retrieval.
5.  **Handling Background Tasks Smoothly**
    *   Using WorkManager to index documents without draining the battery.
6.  **Challenges Faced & Lessons Learned**
    *   Managing model weight downloads.
    *   Optimizing memory for local LLMs on mobile.
7.  **Conclusion & Call to Action**
    *   Link to the GitHub repository.
    *   Invite contributors and feedback.

## 3. Submitting to Awesome Lists on GitHub

Awesome lists are a great way to get long-term visibility.

### How to Submit:

1.  **Find Relevant Lists:**
    *   [awesome-android](https://github.com/JStumpp/awesome-android)
    *   [awesome-android-ui](https://github.com/wasabeef/awesome-android-ui) (if you want to highlight the Compose UI)
    *   [awesome-local-ai](https://github.com/janhq/awesome-local-ai)
2.  **Read the Guidelines:** Every list has a `CONTRIBUTING.md`. Read it carefully to ensure your app fits their criteria (some require a certain number of stars or specific formatting).
3.  **Fork the Repository:** Fork the awesome list repo to your own account.
4.  **Add Private Librarian:** Edit the `README.md` of the awesome list. Find the appropriate category (e.g., "Productivity", "AI", "Search"). Add the entry alphabetically or chronologically depending on the rules.
    *   *Example Entry:* `[Private Librarian](https://github.com/bunty615107/Private-Libratian) - A privacy-first, on-device AI assistant that indexes local documents using Gemma 4.`
5.  **Create a Pull Request:** Submit a PR with a clear title (e.g., "Add Private Librarian to Productivity Apps"). Explain what the app does in the description.

## 4. XDA Developers Forum Post Template

**Forum Section:** Android Apps and Games -> Android Apps

**Title:** [APP][8.0+] Private Librarian - 100% Offline AI Document Assistant (Gemma 4)

**Post:**

Hello XDA!

I'd like to present an open-source app I've developed called **Private Librarian**. It brings the power of AI document analysis directly to your phone, completely offline.

**Features:**
*   **Local AI:** Uses Gemma 4 (4-bit quantized) running on-device via MediaPipe.
*   **Semantic Search:** Quickly find answers inside your PDFs, images, and notes using ObjectBox Vector DB.
*   **Privacy First:** No cloud API calls. Your documents never leave your device.
*   **Background Indexing:** Automatically scans your folders efficiently using WorkManager.
*   **Material 3 UI:** Clean, modern interface built with Jetpack Compose.

**How it works:**
The app indexes your local files, creates vector embeddings, and stores them locally. When you ask a question, it finds the relevant context from your files and uses the local Gemma model to generate an answer.

**Requirements:**
*   Android 8.0+
*   Adequate RAM/Storage for the Gemma 4 model weights.

**Downloads & Source Code:**
*   **GitHub (Source & Releases):** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

Feedback, bug reports, and contributions are very welcome! Please open an issue on GitHub or reply to this thread.
