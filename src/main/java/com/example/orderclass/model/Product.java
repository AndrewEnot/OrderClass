package com.example.orderclass.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author Oksiuta Andrii
 * 11.01.2023
 * 10:40
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private int id;
  private String name;
  private double cost;

}
