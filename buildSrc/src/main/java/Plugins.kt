object Plugins {
    object Gradle {
        private const val version = "4.0.1"
        const val plugin = "com.android.tools.build:gradle:$version"
    }

    object Kotlin {
        private const val version = Dependencies.Kotlin.version
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Hilt {
        private const val version = Dependencies.Dagger.version
        const val plugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Navigation {
        private const val version = "2.3.0"
        const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
    }
}