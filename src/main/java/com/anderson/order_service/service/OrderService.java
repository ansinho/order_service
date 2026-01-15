package com.anderson.order_service.service;

import org.springframework.stereotype.Service;

import com.anderson.order_service.domain.entity.Order;
import com.anderson.order_service.domain.repository.OrderRepository;
import com.anderson.order_service.dto.OrderRequest;
import com.anderson.order_service.messaging.producer.OrderProducer;

@Service
public class OrderService {

    private final OrderRepository repository;
    private final OrderProducer producer;

    public OrderService(OrderRepository repository, OrderProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }

    public Order create(OrderRequest request) {
        Order order = new Order(
                request.description(),
                "CREATED");

        Order saved = repository.save(order);

        producer.sendOrderCreated(saved.getId().toString());

        return saved;
    }
}
