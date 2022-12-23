import org.springframework.boot.gradle.tasks.bundling.BootJar
import org.springframework.boot.gradle.tasks.run.BootRun

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()

    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:3.0.0")
    }
}

plugins {
    id("java")
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.1.0"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.0")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}


tasks.withType<BootRun>().configureEach {
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.withType<BootJar>().configureEach {
    classifier = "boot"
}

