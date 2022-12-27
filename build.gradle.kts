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
//    id("net.ltgt.errorprone") version "3.0.1"
    id("com.diffplug.spotless") version "6.12.0"



}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.0")
    implementation("org.springframework.data:spring-data-jpa:3.0.0")
    implementation("org.springframework.data:spring-data-commons:3.0.0")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.12.0")


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

spotless {
    // optional: limit format enforcement to just the files changed by this feature branch
    ratchetFrom ("master")

    format ("misc") {
    // define the files to apply `misc` to
    target ("*.gradle", "*.md", ".gitignore")

    // define the steps to apply to those files
    trimTrailingWhitespace()
    indentWithTabs() // or spaces. Takes an integer argument if you don't like 4
    endWithNewline()
}
    java {
        // don't need to set target, it is inferred from java

        // apply a specific flavor of google-java-format
        googleJavaFormat("1.15.0").aosp().reflowLongStrings()
        // fix formatting of type annotations
        formatAnnotations()
        // make sure every file has the following copyright header.
        // optionally, Spotless can set copyright years by digging
        // through git history (see "license" section below)
//        licenseHeader "/* (C)$YEAR */"
    }
}