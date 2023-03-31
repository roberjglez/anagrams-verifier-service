# anagrams-verifier-service

Service to check if two texts are anagrams of each other.

## Prerequisites

- Code language: Java 17
- Maven
- Hexagonal architecture
- Testing: Junit5 & Mockito

## Compilation and testing

You can compile the project using the normal mvn commands like:

```bash
mvn clean install
mvn clean compile
mvn test
```

Also, you can run the compilation and testing of the project with makefile:

```bash
make compile-test
```

## Execution

If you want to execute the application, you can use Makefile defined in the root of the project. You can run the challenge with the following command:

```bash
make execute-anagrams-verifier-service
```

Or alternatively, you can execute main method of ApplicationScanner class directly.
