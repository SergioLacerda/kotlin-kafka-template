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

try with strings:

```bash
http://localhost:8080/send?message=HelloKafka
```

try with JSON body:
```bash
curl -X POST http://localhost:8080/send \
-H "Content-Type: application/json" \
-d '{
  "message": {
    "nome": "jose",
    "idade": "51"
  },
  "topic": "test-topic-json",
  "priority": "high",
  "timestamp": "2024-09-19T12:00:00Z"
}'
```


### Tips
On Linux, if the Kafka/Docker Compose system cannot find the Docker container, 
you might see the following error in the console log:
```
Kafka Error connecting to node ubuntukafka:9092 (id: 0 rack: null)
```

To solve this, add this line on file `/etc/hosts`
```
127.0.0.1:9092    kafka
```