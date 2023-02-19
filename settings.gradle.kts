pluginManagement {
    includeBuild("plugin")
}
plugins {
    id("com.secray.plugin")
}
print("123")
rootProject.name = "Sample"
include(":app")
