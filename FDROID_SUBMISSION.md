# F-Droid Submission Guide

This guide explains how to submit the Private Librarian app to F-Droid.

## Prerequisites

- F-Droid builds apps from source. Make sure the app's source code is public and open-source (this repository is).
- F-Droid only accepts open-source dependencies. Ensure your `build.gradle` has no proprietary binary blobs unless explicitly allowed by F-Droid policies.
- The `fastlane/metadata/android/` folder in this repository contains the app description, title, and changelogs. F-Droid will use this automatically.

## Submission Steps

### 1. Fork the `fdroiddata` Repository

Go to [GitLab](https://gitlab.com/fdroid/fdroiddata) and fork the `fdroiddata` repository to your account. This is the main repository holding metadata for all F-Droid apps.

### 2. Create the App Metadata File

In your fork, create a new YAML file under `metadata/com.privatelibrarian.app.yml`.

Example content for `com.privatelibrarian.app.yml`:

```yaml
Categories:
  - System
  - Reading
License: Apache-2.0
SourceCode: https://github.com/bunty615107/Private-Libratian
IssueTracker: https://github.com/bunty615107/Private-Libratian/issues

AutoUpdateMode: Version
UpdateCheckMode: Tags
CurrentVersion: '1.0'
CurrentVersionCode: 1

Builds:
  - versionName: '1.0'
    versionCode: 1
    commit: v1.0
    subdir: app
    gradle:
      - yes
```

*Note: Update the `commit` tag to point to the correct release tag in your repository.*

### 3. Test the Build Locally (Optional but Recommended)

You can clone F-Droid server tools and run them locally to verify the build:
```bash
fdroid readmeta
fdroid build com.privatelibrarian.app
```

### 4. Create a Merge Request

1. Commit the `metadata/com.privatelibrarian.app.yml` file to a new branch in your `fdroiddata` fork.
2. Push the branch to GitLab.
3. Open a **Merge Request (MR)** against the upstream `fdroid/fdroiddata` repository.
4. Fill in the MR template provided by F-Droid.
5. Wait for the F-Droid maintainers or automated bots to review the build process. Fix any issues that arise during the build pipeline.

### 5. App Publishing

Once merged, your app will be built and published in the next F-Droid cycle (usually within 1-3 days).

The app will be available at:
`https://f-droid.org/packages/com.privatelibrarian.app/`

## Continuous Updates

When you release a new version of Private Librarian:
1. Tag the release in your GitHub repository.
2. The F-Droid update checker will automatically detect the new tag (due to `UpdateCheckMode: Tags`).
3. F-Droid will automatically build and publish the new version. You don't need to manually update the metadata file unless dependencies change.