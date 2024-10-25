plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.unittestandjetpack"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.unittestandjetpack"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "com.example.unittestandjetpack.HitlTestRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            merges += "META-INF/LICENSE.md"
            merges += "META-INF/LICENSE-notice.md"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    // Unit testing
    testImplementation(libs.junit)
    //Android integration
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.50")

    //Room
    val room_version="2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")



    // material
    implementation("androidx.compose.material:material:1.7.3")
    implementation("androidx.compose.ui:ui:1.7.3")
    implementation("com.google.android.material:material:1.4.0")
    //navigation
    implementation("androidx.navigation:navigation-compose:2.8.2")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")


    //constraint layout
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    // Local unit test
    val testCoreVersion="1.6.1"
    implementation("androidx.test:core:$testCoreVersion")
    val junitVersion="4.13.2"
    testImplementation("junit:junit:$junitVersion")
    val coreTestingVersion ="2.2.0"
    testImplementation("androidx.arch.core:core-testing:$coreTestingVersion")
    val coroutineTestVersion ="1.5.1"
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutineTestVersion")
    val googleTrue="1.1.3"
    testImplementation("com.google.truth:truth:$googleTrue")

    val mockserver="4.9.1"
    testImplementation("com.squareup.okhttp3:mockwebserver:$mockserver")

    val mockk="1.10.5"
    testImplementation("io.mockk:mockk:$mockk")

    val composmanifest="1.7.4"
    debugImplementation("androidx.compose.ui:ui-test-manifest:$composmanifest")

    // Instrumentation tests

    val androidTestDagger="2.37"
    androidTestImplementation("com.google.dagger:hilt-android-testing:$androidTestDagger")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:$androidTestDagger")

    val androidJunit="4.13.2"
    androidTestImplementation("junit:junit:$androidJunit")

    val androidCoroutinex="1.5.1"
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$androidCoroutinex")

    val androidCoreTesting="2.0.0-alpha1"
    androidTestImplementation("androidx.arch.core:core-testing:$androidCoreTesting")

    val androidGoogleTrue="1.1.3"
    androidTestImplementation("com.google.truth:truth:$androidGoogleTrue")

    val androidExtJunit="1.2.1"
    androidTestImplementation("androidx.test.ext:junit:$androidExtJunit")

    val androidCoreKtx="1.4.0"
    androidTestImplementation("androidx.test:core-ktx:$androidCoreKtx")

    val androidokHttp="4.9.1"
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:$androidokHttp")

    val mokkIO="1.13.13"
    androidTestImplementation("io.mockk:mockk-android:$mokkIO")

    val runner="1.6.2"
    androidTestImplementation("androidx.test:runner:$runner")





}