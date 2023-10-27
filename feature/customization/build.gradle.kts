plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    namespace = "com.diegomalone.morsenotifier"
    compileSdk = AndroidSdk.compile

    sourceSets["main"].java.srcDir("src/main/kotlin")

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

    implementation(project(":data"))

    implementation(Dependencies.appCompat)

    implementation(Dependencies.coroutines)
    implementation(Dependencies.lifecycleLiveData)
    implementation(Dependencies.lifecycleViewModel)

    implementation(Dependencies.koin)
    implementation(Dependencies.koinScope)
    implementation(Dependencies.koinViewModel)
}
