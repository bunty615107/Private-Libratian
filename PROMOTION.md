# Private Librarian - Community Submission and Promotion Guide

This document provides templates and outlines for promoting the **Private-Libratian** repository across various open-source and developer communities.

## 1. Reddit Submission Templates

### r/androidapps
**Title:** [DEV] Private-Libratian: A 100% Offline, Privacy-First AI Assistant for Local Documents
**Body:**
Hello r/androidapps!
I am excited to share **Private-Libratian**, an open-source Android application that indexes your local documents (PDFs, images, notes) and allows you to query them using natural language—completely offline.

*Why use it?*
- **Absolute Privacy:** Your data never leaves your device. No cloud APIs are used.
- **Local AI:** Powered by a 4-bit quantized Gemma 4 model running via MediaPipe.
- **Semantic Search:** Uses ObjectBox Vector DB for lightning-fast, high-dimensional vector retrieval.
- **Background Indexing:** Automatically scans and indexes local files efficiently using WorkManager.

Check it out and let me know your thoughts or feature requests!
**GitHub:** [Private-Libratian](https://github.com/bunty615107/Private-Libratian)

---

### r/opensource
**Title:** [Show r/opensource] Private-Libratian – An On-Device, Privacy-First Android AI Assistant powered by Gemma 4
**Body:**
Hi everyone,
I’ve recently open-sourced **Private-Libratian**. It’s an Android assistant that searches through your local files (PDFs, images, text) using local AI.
It uses **Gemma 4** (via MediaPipe) and **ObjectBox Vector DB** for semantic search. Everything runs locally on your device, ensuring complete data privacy.
If you're interested in on-device AI or Jetpack Compose, I'd love your feedback!
**Repo:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

---

### r/selfhosted
**Title:** Private-Libratian: An open-source Android app to "self-host" AI document search directly on your phone
**Body:**
Hey r/selfhosted,
While this isn’t a typical server-side self-hosted tool, it perfectly aligns with the community's privacy-first ethos. **Private-Libratian** is an Android app that indexes and searches your local documents using AI, completely offline.
Instead of sending your data to the cloud, it runs **Gemma 4** locally via MediaPipe and stores vector embeddings using ObjectBox Vector DB. Your data stays securely on your device.
**GitHub:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

## 2. Dev.to Article Outline Template

**Title:** Building a 100% Offline AI Assistant for Android with Gemma 4 and Jetpack Compose

**Outline:**
1. **Introduction:** The need for private, offline AI document search on mobile devices.
2. **Project Architecture:** Overview of the tech stack (Kotlin, Jetpack Compose, Coroutines).
3. **Local LLM Integration:** Running Gemma 4 locally using the MediaPipe LLM Inference Engine.
4. **Semantic Search Implementation:** Utilizing ObjectBox Vector DB for fast, on-device vector retrieval.
5. **Efficient Background Indexing:** Using WorkManager to handle document scanning without draining the battery.
6. **Challenges and Learnings:** Overcoming memory constraints and optimizing mobile AI performance.
7. **Conclusion & Call to Action:** Encouraging contributions and sharing the GitHub repository link.

## 3. Submitting to Awesome Lists on GitHub

To gain long-term visibility, submit Private-Libratian to relevant "Awesome Lists":

1. **Find Target Lists:**
   - [awesome-android](https://github.com/JStumpp/awesome-android)
   - [awesome-local-ai](https://github.com/janhq/awesome-local-ai)
2. **Review Guidelines:** Carefully read the `CONTRIBUTING.md` of each target repository.
3. **Fork and Edit:** Fork the list, and add an alphabetical/chronological entry under a relevant category (e.g., "AI", "Productivity").
   - *Example Entry:* `[Private-Libratian](https://github.com/bunty615107/Private-Libratian) - A privacy-first, on-device AI assistant that indexes local documents using Gemma 4.`
4. **Submit a Pull Request:** Create a PR detailing what the app does.

## 4. XDA Developers Forum Post Template

**Forum Section:** Android Apps and Games -> Android Apps

**Title:** [APP][8.0+] Private-Libratian - 100% Offline AI Document Assistant (Gemma 4)

**Post:**
Hello XDA community!
I'm excited to present an open-source app called **Private-Libratian**. It brings powerful AI document analysis directly to your phone, completely offline.

**Features:**
- **Local AI:** Uses a 4-bit quantized Gemma 4 model running via MediaPipe.
- **Semantic Search:** Quickly find answers inside your PDFs, images, and notes using ObjectBox Vector DB.
- **Privacy First:** Your documents never leave your device.
- **Background Indexing:** Automatically and efficiently scans your folders using WorkManager.
- **Modern UI:** Built from the ground up with Jetpack Compose and Material 3.

**Requirements:**
- Android 8.0+
- Adequate RAM/Storage to support the Gemma 4 model weights.

**Downloads & Source Code:**
- **GitHub:** [https://github.com/bunty615107/Private-Libratian](https://github.com/bunty615107/Private-Libratian)

I'd appreciate your feedback, bug reports, and any contributions!
