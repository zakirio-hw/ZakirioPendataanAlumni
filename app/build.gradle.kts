plugins {
    alias(libs.plugins.android.application)
}

android {
    // namespace = "com.example.uts"
    namespace = "pnj.uts.ti.zakirio_hugoraazaq_wasis"
    compileSdk = 34

    defaultConfig {
        // applicationId = "com.example.uts"
        applicationId = "pnj.uts.ti.zakirio_hugoraazaq_wasis"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Scalable Size
    //implementation("com.intuit.sdp:sdp-android:1.0.6")
    //implementation("com.intuit.ssp:ssp-android:1.0.6")

    //Circular Image
    //implementation("de.hdodenhof:circleimageview:3.1.0")

    //Image Crop Dependency
    //implementation("com.theartofdev.edmodo:android-image-cropper:2.8.+")
}