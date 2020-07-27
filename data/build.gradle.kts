plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)

    sourceSets["main"].java.srcDir("src/main/kotlin")
    sourceSets["test"].java.srcDir("src/test/kotlin")
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(project(":domain"))

    implementation(Dependencies.appCompat)

    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesAndroid)

    testImplementation(Dependencies.TestDependencies.junit)
    testImplementation(Dependencies.TestDependencies.truth)
    testImplementation(Dependencies.TestDependencies.mockk)
}