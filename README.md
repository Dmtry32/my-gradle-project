# my-gradle-project
 Building a Java Library with Gradle and Publishing to Maven Central (Sonatype)
 We'll build a small project with two modules: a library (lib) and an application that uses it (app). This structure is typical and scalable.
 # Project structure :
 my-project/
├── settings.gradle
├── gradle.properties
├── build.gradle
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── lib/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   └── java/...          (library source code)
│       └── test/
│           └── java/...           (library tests)
└── app/
    ├── build.gradle
    └── src/
        ├── main/
        │   └── java/...           (application entry point)
        └── test/
            └── java/...            (application tests)
