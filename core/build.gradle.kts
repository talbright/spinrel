dependencies {
    kapt("com.google.dagger:dagger-compiler")

    implementation(kotlin("stdlib-jdk8"))
    implementation("com.charleskorn.kaml:kaml")
    implementation("com.google.cloud:google-cloud-storage")
    implementation("com.google.dagger:dagger")
    implementation("com.google.guava:guava")
    implementation("io.github.microutils:kotlin-logging")
    implementation("org.apache.commons:commons-compress")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime")

    testImplementation("com.google.cloud:google-cloud-nio")
    testImplementation("com.google.jimfs:jimfs")
    testImplementation("io.mockk:mockk")
    testImplementation("io.strikt:strikt-core")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
