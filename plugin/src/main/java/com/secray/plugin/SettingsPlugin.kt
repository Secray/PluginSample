package com.secray.plugin

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.initialization.resolve.RepositoriesMode

class SettingsPlugin : Plugin<Settings> {
    override fun apply(target: Settings) {
        println("start settings")
        println(target.providers.gradleProperty("kotlin.code.style").get())
        target.run {
            pluginManagement {
                repositories {
                    google()
                    mavenCentral()
                    gradlePluginPortal()
                }
            }
            dependencyResolutionManagement {
                repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                repositories {
                    google()
                    mavenCentral()
                }
            }
        }
    }

}