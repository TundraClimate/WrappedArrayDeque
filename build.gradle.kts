import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "io.github.tundraclimate"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}