package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.OrderItem;
import com.example.databasedesignwithjpa.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @PostMapping("/orderItem/{orderId}/{productId}")
    public OrderItem saveOrderItem(@RequestBody OrderItem orderItem, @PathVariable("orderId") Long orderId,
                                   @PathVariable("productId") Long productId) {

        return orderItemService.saveOrderItem(orderItem,orderId,productId);
    }


}
