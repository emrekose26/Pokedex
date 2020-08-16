object Dependencies {

    object AndroidX {
        object AppCompat {
            private const val version = "1.2.0"
            const val appcompat = "androidx.appcompat:appcompat:$version"
        }

        object Core {
            private const val version = "1.3.1"
            const val core = "androidx.core:core-ktx:$version"
        }

        object ConstraintLayout {
            private const val version = "1.1.3"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:$version"
        }

        object Fragment {
            private const val version = "1.3.0-alpha06"
            const val fragment = "androidx.fragment:fragment-ktx:$version"
        }

        object Hilt {
            private const val version = "1.0.0-alpha01"
            const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$version"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
        }

        object Lifecycle {
            private const val version = "2.3.0-alpha05"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val common = "androidx.lifecycle:lifecycle-common-java8:$version"
        }

        object Navigation {
            const val version = "2.3.0"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object RecyclerView {
            private const val version = "1.2.0-alpha04"
            const val recyclerview = "androidx.recyclerview:recyclerview:$version"
        }

        object Room {
            private const val version = "2.2.5"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
            const val testing = "androidx.room:room-testing:$version"
        }
    }

    object Kotlin {
        const val version = "1.3.72"
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$version"

        object Coroutines {
            private const val version = "1.3.8"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        }
    }

    object Material {
        private const val version = "1.2.0"
        const val material = "com.google.android.material:material:$version"
    }

    object Dagger {
        const val version = "2.28-alpha"
        const val hiltAndroid = "com.google.dagger:hilt-android:$version"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$version"
    }

    object OkHttp {
        private const val version = "4.8.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Moshi {
        private const val version = "1.9.2"
        const val moshi = "com.squareup.moshi:moshi-kotlin:$version"
        const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$version"
    }

    object Coil {
        private const val version = "0.11.0"
        const val coil = "io.coil-kt:coil:$version"
    }

    object Test {
        object Junit {
            private const val version = "4.12"
            const val junit = "junit:junit:$version"
        }

        object Ext {
            private const val version = "1.1.1"
            const val ext = "androidx.test.ext:junit:$version"
        }

        object Espresso {
            private const val version = "3.2.0"
            const val espresso = "androidx.test.espresso:espresso-core:$version"
        }
    }
}