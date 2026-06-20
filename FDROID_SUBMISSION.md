# F-Droid Submission Guide

This guide explains how to submit **Private Librarian** to F-Droid.

## 1. Fork the `fdroiddata` Repository
1. Go to the [fdroiddata repository](https://gitlab.com/fdroid/fdroiddata) on GitLab.
2. Fork the repository to your own account.
3. Clone your fork locally:
   ```bash
   git clone https://gitlab.com/<your-username>/fdroiddata.git
   cd fdroiddata
   ```

## 2. Create the Metadata YAML File
F-Droid uses a YAML file to build and package your app. Create a file named `metadata/com.privatelibrarian.app.yml` in the `fdroiddata` repository with the following content:

```yaml
Categories:
  - System
License: MIT
AuthorName: bunty615107
AuthorEmail: bunty615107@example.com
SourceCode: https://github.com/bunty615107/Private-Libratian
IssueTracker: https://github.com/bunty615107/Private-Libratian/issues

Summary: A privacy-first, on-device AI assistant.
Description: |-
    Private Librarian is a privacy-first, on-device AI assistant for Android that
    indexes your local documents (PDFs, images, notes) and provides natural-language
    answers using Gemma 4.

    Features:
    * 100% Offline: No documents or embeddings ever leave your device.
    * Semantic Search: Powered by ObjectBox Vector DB for fast retrieval.
    * Local LLM: Uses Gemma 4 (4-bit quantized) via MediaPipe.

RepoType: git
Repo: https://github.com/bunty615107/Private-Libratian.git

Builds:
  - versionName: '1.0'
    versionCode: 1
    commit: v1.0
    subdir: app
    gradle:
      - yes

AutoUpdateMode: Version v%v
UpdateCheckMode: Tags
CurrentVersion: '1.0'
CurrentVersionCode: 1
```
*(Make sure lines do not exceed 80 characters to pass yamllint checks!)*

## 3. Verify Fastlane Metadata
We use the Fastlane metadata structure which F-Droid supports out of the box. Ensure the `fastlane/metadata/android/` structure in the Private-Libratian repository is up to date:
- `en-US/title.txt`
- `en-US/short_description.txt`
- `en-US/full_description.txt`
- `en-US/changelogs/<versionCode>.txt`

## 4. Run F-Droid Linter and Build
It is highly recommended to run the F-Droid build tools locally before submitting a PR.
```bash
# Inside fdroiddata directory
fdroid lint com.privatelibrarian.app
fdroid build -v -l com.privatelibrarian.app
```

## 5. Submit the Merge Request
1. Commit the new metadata file to your `fdroiddata` fork.
2. Push your branch to GitLab.
3. Create a Merge Request (MR) against the main F-Droid repository.
4. Fill out the MR template, noting any special build instructions (e.g., downloading the Gemma 4 weights during build if they aren't bundled, or relying on user-provided weights).
