object Dependencies {
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    const val apacheCommons = "org.apache.commons:commons-lang3:${Versions.apacheCommons}"
    const val koin = "io.insert-koin:koin-android:${Versions.koin}"
    const val koinScope = "io.insert-koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModel = "io.insert-koin:koin-androidx-viewmodel:${Versions.koin}"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    object TestDependencies {
        const val junit = "org.junit.jupiter:junit-jupiter:${Versions.junit}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
        const val truth = "com.google.truth:truth:${Versions.truth}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
    }
}
