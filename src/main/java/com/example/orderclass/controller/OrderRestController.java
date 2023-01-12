package com.example.orderclass.controller;

import com.example.orderclass.model.Order;
import com.example.orderclass.services.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Oksiuta Andrii
 * 12.01.2023
 * 11:58
 */
@RestController
@RequiredArgsConstructor
public class OrderRestController {

  private final OrderRepository orderRepository;

  @GetMapping(value = "/talk/get_order/{id}")
  public Order getOrderById(@PathVariable int id) {
    return orderRepository.getOrderById(id);
  }

  @GetMapping(value = "/talk/get_all_orders/")
  public List<Order> getAllOrders() {
    return orderRepository.getAllOrders();
  }
}
