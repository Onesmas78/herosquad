plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation ("com.sparkjava:spark-core:2.9.3")
    implementation ("com.sparkjava:spark-template-handlebars:2.7.1")
    implementation ("com.github.jknack:handlebars:4.3.0")
    implementation ("org.slf4j:slf4j-simple:1.7.36")
    testImplementation("junit:junit:4.12")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}