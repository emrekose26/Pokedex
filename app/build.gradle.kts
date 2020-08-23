plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}
android {
    compileSdkVersion(Configs.compileSdkVersion)
    buildToolsVersion = Configs.buildToolVersion

    defaultConfig {
        applicationId = Configs.applicationId
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)
        versionCode = Configs.versionCode
        versionName = Configs.versionName

        testInstrumentationRunner = Configs.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Kotlin
    implementation(Dependencies.Kotlin.kotlin)
    implementation(Dependencies.Kotlin.Coroutines.core)
    implementation(Dependencies.Kotlin.Coroutines.android)

    // AndroidX
    implementation(Dependencies.AndroidX.Core.core)
    implementation(Dependencies.AndroidX.AppCompat.appcompat)
    implementation(Dependencies.AndroidX.ConstraintLayout.constraintLayout)
    implementation(Dependencies.AndroidX.Fragment.fragment)
    implementation(Dependencies.AndroidX.Lifecycle.viewModel)
    implementation(Dependencies.AndroidX.Lifecycle.liveData)
    implementation(Dependencies.AndroidX.Lifecycle.runtime)
    implementation(Dependencies.AndroidX.RecyclerView.recyclerview)
    implementation(Dependencies.AndroidX.Navigation.fragment)
    implementation(Dependencies.AndroidX.Navigation.ui)
    implementation(Dependencies.AndroidX.Hilt.viewModel)
    kapt(Dependencies.AndroidX.Hilt.compiler)

    // Material
    implementation(Dependencies.Material.material)

    // Dagger-Hilt
    implementation(Dependencies.Dagger.hiltAndroid)
    kapt(Dependencies.Dagger.hiltAndroidCompiler)

    // Networking
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.OkHttp.okhttp)
    implementation(Dependencies.OkHttp.loggingInterceptor)

    // Moshi
    implementation(Dependencies.Moshi.moshi)
    implementation(Dependencies.Retrofit.moshiConverter)
    kapt(Dependencies.Moshi.moshiCodegen)

    // Image Loading
    implementation(Dependencies.Coil.coil)

    // Test
    testImplementation(Dependencies.Test.Junit.junit)
    androidTestImplementation(Dependencies.Test.Ext.ext)
    androidTestImplementation(Dependencies.Test.Espresso.espresso)

}