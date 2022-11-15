# spring-native-multi-modules-bind-properties

This is a simple project to demonstrate that `Could not bind properties` error when properties class located in another module uses `@ConstructorBinding` in multi-module gradle spring boot project.

## Environment
- Spring Boot: 3.0.0-RC2
- Native Buildtools: 0.9.17 
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
o.s.c.support.GenericApplicationContext  : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'application': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'greetings-com.example.greetings.configuration.GreetingsProperties': Could not bind properties to 'GreetingsProperties' : prefix=greetings, ignoreInvalidFields=false, ignoreUnknownFields=true
```

## Runs without issues on JVM
```
./gradlew bootRun
```

## Expected behavior
Application starts without issues using JVM and native image.
