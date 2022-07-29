package com.buss.spring.repositories;

import com.buss.spring.entities.OrderItem;
import com.buss.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
