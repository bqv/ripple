plugins {
    id(BuildPlugins.libraryPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    namespace = "com.diegomalone.morsenotifier.actuator"
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

    // TODO Remove domain dependency
    implementation(project(":domain"))
}
