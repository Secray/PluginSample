pluginManagement {
    includeBuild("plugin")
    includeBuild("build-logic")
}
plugins {
    id("com.secray.plugin")
}
rootProject.name = "Sample"
include(":app")
