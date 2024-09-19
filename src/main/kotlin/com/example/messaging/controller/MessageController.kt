package com.example.messaging.controller

import com.example.messaging.domain.MessageRequest
import com.example.messaging.producer.ProducerService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(private val producerService: ProducerService) {

    @GetMapping("/send")
    fun sendMessage(@RequestParam message: String): String {
        producerService.sendMessage("test-topic", message)
        return "Message sent: $message"
    }

    @PostMapping("/send")
    fun sendMessage(@RequestBody messageRequest: MessageRequest): String {
        producerService.sendJSONMessage(messageRequest.topic, messageRequest.message)

        return "Message sent: ${messageRequest.message} " +
               "to topic: ${messageRequest.topic} " +
               "with priority: ${messageRequest.priority} " +
               "at ${messageRequest.timestamp}"
    }
}