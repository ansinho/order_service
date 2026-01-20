package com.anderson.order_service.messaging.consumer;

import com.anderson.order_service.config.RabbitConfig;
import com.anderson.order_service.messaging.dto.OrderCreatedEvent;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = RabbitConfig.ORDER_QUEUE)
    public void consume(OrderCreatedEvent event) {
        System.out.println("Evento recebido:");
        System.out.println("OrderId: " + event.orderId());
        System.out.println("Criado em: " + event.createdAt());
    }
}
