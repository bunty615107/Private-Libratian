# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.

# Keep ObjectBox entities
-keep class com.privatelibrarian.app.data.local.** { *; }

# Keep MediaPipe classes
-keep class com.google.mediapipe.** { *; }
