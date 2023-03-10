import org.gradle.api.artifacts.ExternalModuleDependency

object Versions {
    val min_sdk = 21
    val target_sdk = 32
    val compile_sdk = "android-31"
    val buildToolsVersion = "30.0.3"

    val kotlin = "1.7.20"
    val google_services = "4.3.3"
    val junit = "4.13.2"
    val sqlDelight = "1.5.3"
    val multiplatformSettings = "0.9"
    val coroutines = "1.6.3-native-mt"
    val koin = "3.2.0"
    val xcodesync = "0.2"
    val timber = "4.7.1"
    val stately = "1.1.7"
    val cocoapodsext = "0.6"
    val desugarJdkLibs = "1.1.5"
    val ktorVersion = "2.0.3"
    val kotlinSerialization = "1.4.0"
    val kermitLogger = "1.2.2"

    object AndroidX {
        val appcompat = "1.3.0"
        val constraintlayout = "2.0.4"
        val core = "1.5.0"
        val lifecycle = "2.5.0"
        val recyclerview = "1.2.0"
        val swipeRefresh = "1.1.0"
        val test = "1.3.0"
        val test_ext = "1.1.2"
    }
}

object Deps {
    val junit = "junit:junit:${Versions.junit}"
    val google_services = "com.google.gms:google-services:${Versions.google_services}"
    val multiplatformSettings =
        "com.russhwolf:multiplatform-settings:${Versions.multiplatformSettings}"
    val multiplatformSettingsTest =
        "com.russhwolf:multiplatform-settings-test:${Versions.multiplatformSettings}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val stately = "co.touchlab:stately-common:${Versions.stately}"
    val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:${Versions.desugarJdkLibs}"

    object Koin {
        val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
        val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    }

    object KotlinSerialization {
        val kotlinSerialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinSerialization}"
        val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        val kotlinserialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    }

    object Ktor {
        val ktorMock = "io.ktor:ktor-client-mock:${Versions.ktorVersion}"
        val ktorNet = "io.ktor:ktor-network:${Versions.ktorVersion}"
        val ktorNetTls = "io.ktor:ktor-network-tls:${Versions.ktorVersion}"
        val ktorClientCore = "io.ktor:ktor-client-core:${Versions.ktorVersion}"
        val ktorClientCio = "io.ktor:ktor-client-cio:${Versions.ktorVersion}"
        val ktorWebsockets = "io.ktor:ktor-client-websockets:${Versions.ktorVersion}"
        val ktorSerializationJson =
            "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktorVersion}"
        val ktorClientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktorVersion}"
    }

    object AndroidX {
        val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
        val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintlayout}"
        val recyclerView = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
        val swipeRefresh =
            "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.AndroidX.swipeRefresh}"

        val lifecycle_runtime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
        val lifecycle_viewmodel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
        val lifecycle_viewmodel_extensions =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
        val lifecycle_livedata =
            "androidx.lifecycle:lifecycle-livedata:${Versions.AndroidX.lifecycle}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object SqlDelight {
        val gradle = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        val coroutines = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        val coroutinesJvm =
            "com.squareup.sqldelight:coroutines-extensions-jvm:${Versions.sqlDelight}"
        val driverIos = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        val driverAndroid = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
    }

    object KermitLogger {
        val stdLib = "stdlib-common"
        val kermit = "co.touchlab:kermit:${Versions.kermitLogger}"
    }
}
