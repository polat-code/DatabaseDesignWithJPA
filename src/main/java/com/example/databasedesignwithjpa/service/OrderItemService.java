package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Order;
import com.example.databasedesignwithjpa.model.OrderItem;
import com.example.databasedesignwithjpa.model.Product;
import com.example.databasedesignwithjpa.repository.OrderItemRepository;
import com.example.databasedesignwithjpa.repository.OrderRepository;
import com.example.databasedesignwithjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;
    public OrderItem saveOrderItem(OrderItem orderItem, Long orderId, Long productId) {
        Order order = orderRepository.findById(orderId).get();
        Product product = productRepository.findById(productId).get();
        orderItem.setOrder(order);
        orderItem.setProduct(product);

        return orderItemRepository.save(orderItem);
    }
}
