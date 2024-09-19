package com.example.messaging.producer

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ProducerService(
    private val kafkaTemplate: KafkaTemplate<String, String>,
    private val objectMapper: ObjectMapper) {

    fun sendMessage(topic: String, message: String) {
        println("Sending message: $message to topic: $topic")

        kafkaTemplate.send(topic, message)
    }

    fun sendJSONMessage(topic: String, message: Map<String, Any>) {
        val jsonMessage = objectMapper.writeValueAsString(message)

        println("Sending message: $jsonMessage to topic: $topic")

        kafkaTemplate.send(topic, jsonMessage)
    }
    
}