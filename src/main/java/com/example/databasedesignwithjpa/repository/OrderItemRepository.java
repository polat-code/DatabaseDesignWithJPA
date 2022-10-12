package com.example.databasedesignwithjpa.repository;

import com.example.databasedesignwithjpa.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
