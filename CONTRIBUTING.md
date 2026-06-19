# Contributing to Private Librarian

First off, thank you for considering contributing to Private Librarian! It's people like you that make this privacy-first, on-device AI assistant better.

This document provides guidelines and instructions for contributing to this repository.

## Table of Contents
1. [Code of Conduct](#code-of-conduct)
2. [How Can I Contribute?](#how-can-i-contribute)
   - [Reporting Bugs](#reporting-bugs)
   - [Suggesting Enhancements](#suggesting-enhancements)
   - [Submitting Pull Requests](#submitting-pull-requests)
3. [Development Setup](#development-setup)
4. [Code Style Guidelines](#code-style-guidelines)

## Code of Conduct

By participating in this project, you are expected to uphold our [Code of Conduct](CODE_OF_CONDUCT.md). Please read it to understand the behavior we expect from contributors.

## How Can I Contribute?

### Reporting Bugs

If you find a bug, please use the [Bug Report](.github/ISSUE_TEMPLATE/bug_report.md) template to submit an issue. Ensure you provide:
* A clear and concise description.
* Steps to reproduce the bug.
* The expected behavior.
* Relevant details like device information and screenshots.

### Suggesting Enhancements

Have an idea to make Private Librarian better? Great! Use the [Feature Request](.github/ISSUE_TEMPLATE/feature_request.md) template to submit an enhancement. Please include:
* The problem the feature solves.
* A description of the proposed solution.
* Any alternative approaches you've considered.

### Submitting Pull Requests

1. **Fork the repository** and clone your fork locally.
2. **Create a new branch** for your feature or bug fix (`git checkout -b feature/your-feature-name` or `git checkout -b fix/your-bug-fix`).
3. **Make your changes**.
4. **Test your changes** to ensure they don't break existing functionality and perform as expected.
5. **Commit your changes** with a clear and descriptive commit message.
6. **Push to your branch** (`git push origin feature/your-feature-name`).
7. **Submit a Pull Request** against the `main` branch. Use the provided [Pull Request Template](.github/pull_request_template.md) and fill out the checklist.

## Development Setup

To get started with local development:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/bunty615107/Private-Libratian.git
   cd Private-Libratian
   ```

2. **Model Weights**:
   Private Librarian relies on **Gemma 4** for local inference.
   * Download Gemma 4 E2B/E4B weights suitable for MediaPipe.
   * Place the downloaded weights into the `app/src/main/assets/` directory.

3. **Build the Project**:
   Open the project in Android Studio or run the Gradle build from the command line:
   ```bash
   ./gradlew assembleDebug
   ```

4. **Run the App**:
   Install the debug build on an Android device or emulator. On the first run, you will need to grant file access permissions to allow the indexing engine to scan folders.

## Code Style Guidelines

* **Kotlin**: Follow the official [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html).
* **Jetpack Compose**: Follow standard Jetpack Compose guidelines for structuring UI components.
* **Architecture**: The project uses an MVVM (Model-View-ViewModel) architecture with Coroutines and Flow. Maintain this structure for new features.
* **Documentation**: Document public classes, functions, and complex logic blocks to make the code easier for others to understand.
