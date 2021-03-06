object BuildPlugins {
    val application by lazy { "com.android.application" }
    val androidJUnitRunner by lazy { "androidx.test.runner.AndroidJUnitRunner" }
    val orgAndroid by lazy { "org.jetbrains.kotlin.android" }
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradle}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

object Dependencies {
    //implementation
    val ktx by lazy { "androidx.core:core-ktx:${Versions.ktx}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }

    //testImplementation
    val junit by lazy { "junit:junit:${Versions.jUnit}" }

    //androidTestImplementation
    val testExt by lazy { "androidx.test.ext:${Versions.testExt}" }
    val testEspresso by lazy { "androidx.test.espresso:espresso-core:${Versions.testEspresso}" }
}