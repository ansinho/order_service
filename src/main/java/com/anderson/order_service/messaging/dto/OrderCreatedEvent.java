package com.anderson.order_service.messaging.dto;

import java.time.Instant;
import java.util.UUID;

public record OrderCreatedEvent(
        UUID orderId,
        Instant createdAt) {
}
