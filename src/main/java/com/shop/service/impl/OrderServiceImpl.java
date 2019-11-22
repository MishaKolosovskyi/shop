package com.shop.service.impl;

import com.shop.model.Order;
import com.shop.repository.OrderJpaRepository;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderJpaRepository orderJpaRepository;

    @Autowired
    public OrderServiceImpl(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public void add(Order order) {
        orderJpaRepository.save(order);
    }

    @Override
    public void save(Order order) {
        orderJpaRepository.save(order);
    }

    @Override
    public Optional<Order> getOrderByUserId(Long id) {
        List<Order> orders = orderJpaRepository.getOrdersByUserId(id);
        if (orders.size() > 0){
            return  Optional.of(orders.get(orders.size() -1));
        }else {
            return Optional.empty();
        }
    }

    @Override
    public void remove(Order order) {
        orderJpaRepository.delete(order);
    }

    @Override
    public void confirm(Order order) {
        order.setConfirm(true);
        orderJpaRepository.save(order);
    }
}
