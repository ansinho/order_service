package com.anderson.order_service.messaging.consumer;

import com.anderson.order_service.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = RabbitConfig.ORDER_QUEUE)
    public void consume(String message) {
        System.out.println("Mensagem recebida do RabbitMQ: " + message);
    }
}
