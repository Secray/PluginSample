plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.8.0"
}

gradlePlugin {
    plugins {
        register("SettingsPlugin") {
            id = "com.secray.plugin"
            implementationClass = "com.secray.plugin.SettingsPlugin"
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}