import org.jetbrains.kotlin.fir.declarations.builder.buildScript

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.0.0").apply(false)
    id("com.android.library").version("7.0.0").apply(false)
    kotlin("android").version("1.8.21").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
    id("com.apollographql.apollo3") version "3.8.2" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
