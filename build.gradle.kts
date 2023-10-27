buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(BuildPlugins.androidGradleClasspath)
        classpath(BuildPlugins.kotlinGradleClasspath)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        mavenCentral()
    }
}

tasks.register("clean").configure {
    delete("build")
}
