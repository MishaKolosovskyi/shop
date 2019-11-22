package com.shop.repository;

import com.shop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, Long> {
    List<Order> getOrdersByUserId(Long id);
}
