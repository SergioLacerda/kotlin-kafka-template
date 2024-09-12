package com.example.messaging.producer

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ConsumerService {

    @KafkaListener(topics = ["test-topic"], groupId = "my-group")
    fun listen(consumerRecord: ConsumerRecord<String, String>) {
        println("Received message: ${consumerRecord.value()} from topic: ${consumerRecord.topic()}")
    }
}