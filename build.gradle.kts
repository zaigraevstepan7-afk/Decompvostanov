plugins {
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.11.0")
}

application {
    mainClass.set("fun.nursultan.restore.Main")
}

tasks.register<JavaExec>("smoke") {
    group = "verification"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("fun.nursultan.restore.Main")
    args("--smoke")
    workingDir = rootDir
}

tasks.register<JavaExec>("selfTest") {
    group = "verification"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("fun.nursultan.restore.Main")
    args("--self-test")
    workingDir = rootDir
}

tasks.named<JavaExec>("run") {
    workingDir = rootDir
}

tasks.named("check") {
    dependsOn("selfTest")
}
