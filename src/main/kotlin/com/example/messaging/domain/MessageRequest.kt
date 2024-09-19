package com.example.messaging.domain

import java.time.Instant

data class MessageRequest(
    val message: Map<String, Any>,
    val topic: String,
    val priority: String,
    val timestamp: Instant
)