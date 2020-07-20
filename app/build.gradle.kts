plugins {
    id(BuildPlugins.applicationPlugin)
    id(BuildPlugins.kotlinAndroidPlugin)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "com.diegomalone.morsenotifier"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    sourceSets["main"].java.srcDir("src/main/kotlin")
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)

    implementation(project(":domain"))
    implementation(project(":actuator"))
    implementation(project(":notification"))

    implementation(project(":customization"))
}
