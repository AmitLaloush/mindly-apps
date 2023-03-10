plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(Deps.Coroutines.common) {
                    version { strictly(Versions.coroutines) }
                }
                //implementation(Deps.SqlDelight.coroutines)
                implementation(Deps.multiplatformSettings)
                implementation(Deps.Koin.koinCore)
                implementation(Deps.stately)
                implementation(Deps.Ktor.ktorNet)
                implementation(Deps.Ktor.ktorNetTls)
                implementation(Deps.Ktor.ktorClientCore)
                implementation(Deps.Ktor.ktorClientCio)
                implementation(Deps.Ktor.ktorWebsockets)
                implementation(Deps.Ktor.ktorSerializationJson)
                implementation(Deps.Ktor.ktorClientSerialization)
                implementation(Deps.KotlinSerialization.kotlinSerialization)
                implementation(kotlin(Deps.KermitLogger.stdLib))
                implementation(Deps.KermitLogger.kermit)

            }
        }

    }
}

android {
    namespace = "com.amit.mindly"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}