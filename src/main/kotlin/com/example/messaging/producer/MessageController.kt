package com.example.messaging.producer

import com.example.messaging.consumer.ProducerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val producerService: ProducerService) {

    @GetMapping("/send")
    fun sendMessage(@RequestParam message: String): String {
        producerService.sendMessage("test-topic", message)
        return "Message sent: $message"
    }
}