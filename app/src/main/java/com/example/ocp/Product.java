package com.example.ocp;

import java.math.BigDecimal;

abstract class Product {

  private final String name;
  private final BigDecimal value;

  protected Product(String name, BigDecimal value) {
    this.name = name;
    this.value = value;
  }

  protected BigDecimal addTax(BigDecimal tax) {

    return value.add(tax);
  }

  String getName() {
    return name;
  }

  BigDecimal getValue() {
    return value;
  }
}
