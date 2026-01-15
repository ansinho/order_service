package com.anderson.order_service.controller;

import org.springframework.web.bind.annotation.*;

import com.anderson.order_service.domain.entity.Order;
import com.anderson.order_service.dto.OrderRequest;
import com.anderson.order_service.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody OrderRequest request) {
        return service.create(request);
    }
}
