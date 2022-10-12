package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.Order;
import com.example.databasedesignwithjpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order/{userId}")
    public Order saveOrder(@RequestBody Order order, @PathVariable("userId") Long userId) {
        return orderService.saveOrder(order,userId);
    }
}
