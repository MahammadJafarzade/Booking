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

rootProject.name = "Booking"
include(":app")
include(":common")
include(":network")
include(":data")
include(":features")
include(":entities")
include(":domain")
include(":features:hotels")
include(":features:login")
include(":features:register")
include(":features:splash")
