package com.example.ocp;

import java.math.BigDecimal;

public abstract class Product {

  private final String name;
  private final BigDecimal value;

  protected Product(String name, BigDecimal value) {
    this.name = name;
    this.value = value;
  }

  protected BigDecimal addTax(BigDecimal tax) {

    return value.add(tax);
  }

  public String getName() {
    return name;
  }

  public BigDecimal getValue() {
    return value;
  }
}
