buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(BuildPlugins.androidGradleClasspath)
        classpath(BuildPlugins.kotlinGradleClasspath)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}
