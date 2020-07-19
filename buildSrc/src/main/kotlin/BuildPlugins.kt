object BuildPlugins {
    const val androidGradleClasspath = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradleClasspath = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val applicationPlugin = "com.android.application"
    const val libraryPlugin = "com.android.library"
    const val javaLibraryPlugin = "java-library"
    const val kotlinPlugin = "kotlin"
    const val kotlinAndroidPlugin = "kotlin-android"
    const val kotlinExtensionsPlugin =  "kotlin-android-extensions"
}