import org.jetbrains.kotlin.fir.declarations.builder.buildScript

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.0.2").apply(false)
    id("com.android.library").version("7.0.2").apply(false)
    kotlin("android").version("1.9.22").apply(false)
    kotlin("multiplatform").version("1.9.22").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
