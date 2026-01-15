package com.anderson.order_service.messaging.producer;

import com.anderson.order_service.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {

    private final RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrderCreated(String orderId) {
        rabbitTemplate.convertAndSend(
                RabbitConfig.ORDER_QUEUE,
                orderId);
    }
}