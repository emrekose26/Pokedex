
# Pokedex App

An Android  application implemented using the MVVM pattern, Coroutines Flow, StateFlow, Retrofit, Dagger-Hilt, ViewModel, Navigation Component, View Binding and some other libraries. The app fetches data from the [Poke API](https://pokeapi.co/) to provide pokemon informations.

## Built With: 
* [Kotlin](https://kotlinlang.org/) First class and official programming language for Android development.
* [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)   help in managing background threads and reduces the need for callbacks.
* [Flow](https://kotlinlang.org/docs/reference/coroutines/flow.html)  A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
* [StateFlow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-state-flow/) A Flow that represents a read-only state with a single updatable data value that emits updates to the value to its collectors
* [Hilt](https://dagger.dev/hilt/) for Dependency Injection
* [Retrofit](https://square.github.io/retrofit/)  A type-safe HTTP client for Android and Java.
* [OkHttp](https://github.com/square/okhttp) for HTTP and HTTP/2 client
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) to store and manage UI-related data in a lifecycle conscious way.
* [Navigation Component](https://developer.android.com/guide/navigation) to handle all navigations and also passing of data between destinations.
* [Material Design](https://material.io/develop/android/docs/getting-started/) Modular and customizable Material Design UI components for Android.
* [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) provides an alternative syntax to the traditional Groovy DSL with an enhanced editing experience in supported IDEs, with superior content assist, refactoring, documentation, and more.
* [Moshi](https://github.com/square/moshi) A modern JSON library for Kotlin and Java.
* [View Binding](https://developer.android.com/topic/libraries/view-binding) Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
* [Coil](https://github.com/coil-kt/coil) An image loading library for Android backed by Kotlin Coroutines.

### TODO
- [ ] Room database implementation
- [ ] Add test cases 

## LICENSE
```

Copyright (C) 2020 Emre Köse

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License..
```
