plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(project(":actuator"))
}