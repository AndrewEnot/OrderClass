package com.example.orderclass.model;

import com.example.orderclass.services.ProductRepository;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


/*
 * @author Oksiuta Andrii
 * 11.01.2023
 * 10:38
 */

@Getter
@Setter
public class Order {

  private int id;
  private LocalDateTime dateTime;
  private double costTotal;
  private List<Product> products;

  public Order(int id, List<Product> products) {
    this.id = id;
    this.dateTime = LocalDateTime.now();
    this.products = products;
    double costs = 0.0;
    for (Product product : products) {
      costs += product.getCost();
    }
    this.costTotal = (Math.round(costs * 100)) / 100.0;
  }

  public void addProductByID(int id, ProductRepository productRepository) {
    if (productRepository != null) {
      products.add(productRepository.getById(id));
    }
  }
}
