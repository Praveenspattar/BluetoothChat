buildscript {
    extra["compose_ui_version"] = "1.2.0"
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
//    id("com.android.application") version "8.5.0-alpha01" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}