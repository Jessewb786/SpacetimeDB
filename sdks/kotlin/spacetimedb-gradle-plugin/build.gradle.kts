plugins {
    alias(libs.plugins.kotlinJvm)
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.clockworklabs"
version = "0.1.0"

kotlin {
    jvmToolchain(25)
}

dependencies {
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.get()}")
}

gradlePlugin {
    plugins {
        create("spacetimedb") {
            id = "com.clockworklabs.spacetimedb"
            implementationClass = "com.clockworklabs.spacetimedb.SpacetimeDbPlugin"
        }
    }
}
