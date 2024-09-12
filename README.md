# Kotlin Kafka Messaging Application

This Kotlin application connects to a Kafka messaging system running via Docker. It uses Spring Kafka to produce and consume messages.

## Prerequisites

- Docker & Docker Compose
- JDK 17+
- Gradle

## Getting Started

### 1. Build the Application

build it using Gradle:

```bash
./gradlew clean build
```

### 2. Run Application

## Kafka via docker
up kafka:

```bash
docker-compose up
```

## run application
to start app run:

```bash
./gradlew bootRun
```

### 3. Sending Messages

```bash
http://localhost:8080/send?message=HelloKafka
```

