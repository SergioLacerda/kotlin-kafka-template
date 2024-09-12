package com.example.messaging.consumer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ProducerService(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(topic: String, message: String) {
        println("Sending message: $message to topic: $topic")
        kafkaTemplate.send(topic, message)
    }
}