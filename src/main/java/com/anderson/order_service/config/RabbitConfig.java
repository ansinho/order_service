package com.anderson.order_service.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String ORDER_QUEUE = "order.created.queue";

    @Bean
    public Queue orderCreatedQueue() {
        return new Queue(ORDER_QUEUE, true);
    }
}
