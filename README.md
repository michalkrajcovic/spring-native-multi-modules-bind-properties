# spring-native-multi-modules-bind-properties

This is a simple project to demonstrate that `org.springframework.boot.context.properties.ConfigurationPropertiesBindException` is thrown when properties class uses `@ConstructorBinding` in multi-module gradle spring boot project.

## Environment
- Spring Boot: 2.7.5
- Spring Native: 0.12.1

- GraalVM version : graalvm-ce-java17-22.3.0
- JDK version: openjdk 17.0.5
- Architecture: AMD64

## Compile
```
./gradlew nativeCompile
```

## Run
```
./greetings-app/build/native/nativeCompile/greetings-app
```

## Fails with 
```
 Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'application': Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.boot.context.properties.ConfigurationPropertiesBindException: Error creating bean with name 'greetings-com.example.greetings.configuration.GreetingsProperties': Could not bind properties to 'GreetingsProperties' : prefix=greetings, ignoreInvalidFields=false, ignoreUnknownFields=true; nested exception is org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'greetings' to com.example.greetings.configuration.GreetingsProperties
```

## Runs without issues on JVM
```
./gradlew bootRun
```

## Expected behavior
Application starts without issues using JVM and native image.
