object Dependencies {
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val apacheCommons = "org.apache.commons:commons-lang3:${Versions.apacheCommons}"
    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    object TestDependencies {
        const val junit = "org.junit.jupiter:junit-jupiter:${Versions.junit}"
    }
}