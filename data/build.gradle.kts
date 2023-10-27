plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    namespace = "com.diegomalone.morsenotifier.data"
    compileSdk = AndroidSdk.compile

    sourceSets["main"].java.srcDir("src/main/kotlin")
    sourceSets["test"].java.srcDir("src/test/kotlin")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
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
    testImplementation(Dependencies.TestDependencies.coroutinesTest)
}
