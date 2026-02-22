// The app module depends on the lib module
dependencies {
    implementation project(':lib')          // dependency on local library
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.2'
}

test {
    useJUnitPlatform()
}