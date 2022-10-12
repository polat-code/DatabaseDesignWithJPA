package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Order;
import com.example.databasedesignwithjpa.model.User;
import com.example.databasedesignwithjpa.repository.OrderRepository;
import com.example.databasedesignwithjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;
    public Order saveOrder(Order order, Long userId) {
        User user = userRepository.findById(userId).get();
        order.setUser(user);
        return orderRepository.save(order);
    }
}
