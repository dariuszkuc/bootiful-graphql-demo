# Bootiful GraphQL with Kotlin Example

Example app showcasing the usage of [graphql-kotlin](https://github.com/ExpediaGroup/graphql-kotlin/) library to build a Reactive GraphQL webserver.

### Building locally

This project uses Gradle and you can build it locally using

```shell script
./gradlew clean build
```

### Running locally

* Run `BootifulApplication.kt` directly from your IDE
* Alternatively you can also use the SpringBoot Gradle plugin by running `./gradlew bootRun` from the command line.

Once the app has started you can explore the example schema by opening the GraphQL Playground endpoint at http://localhost:8080/playground.