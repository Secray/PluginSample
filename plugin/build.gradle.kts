plugins {
    `kotlin-dsl`
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
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}