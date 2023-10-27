plugins {
    id(BuildPlugins.applicationPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    namespace = "io.fron.morse"
    compileSdk = AndroidSdk.compile
    defaultConfig {
        applicationId = "io.fron.morse"
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

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

    implementation(Dependencies.appCompat)
    implementation(Dependencies.koin)

    implementation(project(":actuator"))
    implementation(project(":notification"))

    implementation(project(":customization"))
}
