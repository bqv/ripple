plugins {
    id(BuildPlugins.javaLibraryPlugin)
    id(BuildPlugins.kotlinPlugin)
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)
    implementation(Dependencies.apacheCommons)

    testImplementation(Dependencies.TestDependencies.junit)
}