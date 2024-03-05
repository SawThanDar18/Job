plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "co.nexlabs.betterhr.job.android"
    compileSdk = BuildConfig.compileSdk
    defaultConfig {
        applicationId = "co.nexlabs.betterhr.job.android"
        minSdk = BuildConfig.minSdk
        targetSdk = BuildConfig.targetSdk
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
    }
    signingConfigs {
        /*register("debug") {
            keyAlias = "debug"
            keyPassword = "betterhrjobdebug"
            storeFile = file("../keystore/key.jks")
            storePassword = "betterhrjob"
        }

        register("release") {
            keyAlias = "release"
            keyPassword = "betterhrjobrelease"
            storeFile = file("../keystore/key.jks")
            storePassword = "betterhrjob"
        }*/
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
    buildTypes {

        /*named("jobrelease") {
            multiDexKeepFile = file("multidex-keep-config.txt")
            multiDexKeepProguard = file("multidex-keep-config.pro")

            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro"))
            signingConfig = signingConfigs.getByName("release")
        }

        named("jobdebug") {

            versionNameSuffix = "${BuildConfig.debugTag}"
            applicationIdSuffix = ".debug"

            isDebuggable = true
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro"))

            signingConfig = signingConfigs.getByName("debug")
        }*/
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.foundation:foundation:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.activity:activity-compose:1.7.1")

    //Navigation Bar
    implementation(NavigationCompose.navigationCompose)

    //Material Compose
    implementation(MaterialCompose.material)
    implementation(MaterialCompose.materialSize)
    implementation(MaterialCompose.materialAdaptive)
    implementation(MaterialCompose.materialAdaptiveSuite)

    //Apollo
    implementation(Apollo.gradle_plugin)
    implementation(Apollo.runtime)
    implementation(Apollo.android)
    implementation(Apollo.httpCache)
    implementation(Apollo.rx2)
    implementation(Apollo.coroutines)

    //Apollo
    /*api("com.apollographql.apollo3:apollo-runtime:3.8.2")
    api("com.apollographql.apollo3:apollo-normalized-cache:3.8.2")*/
}