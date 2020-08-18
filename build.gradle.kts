plugins {
    kotlin("jvm") version "1.4.0"
    kotlin("plugin.serialization") version "1.4.0"
    id ("com.github.johnrengelman.shadow") version "6.0.0"
}

group = "com.tekgator"
version = "1.4.0.1"

repositories {
    mavenCentral()
    jcenter()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.0-RC")
    compileOnly ("org.bukkit:bukkit:1.15.2-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.shadowJar.configure {
    archiveClassifier.set("")
}