package com.anderson.order_service.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anderson.order_service.domain.entity.Order;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}