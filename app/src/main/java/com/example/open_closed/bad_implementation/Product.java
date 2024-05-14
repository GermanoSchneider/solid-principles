package com.example.open_closed.bad_implementation;

import java.math.BigDecimal;

class Product {

  private final String name;
  private final BigDecimal value;
  private final Category category;

  Product(String name, BigDecimal value, Category category) {
    this.name = name;
    this.value = value;
    this.category = category;
  }

  BigDecimal getValue() {

    switch (category) {
      case ELECTRONICS -> { return value.add(new BigDecimal(15)); }
      case AUTOMOTIVE -> { return value.add(new BigDecimal(10)); }
      case KITCHEN -> { return value.add(new BigDecimal(5)); }
      default -> { return value; }
    }
  }

  String getName() {
    return name;
  }

  enum Category {
    ELECTRONICS,
    AUTOMOTIVE,
    KITCHEN
  }
}
