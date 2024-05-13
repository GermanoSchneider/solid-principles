package com.example.ocp;

import java.math.BigDecimal;

public class Automotive extends Product {

  public Automotive(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(10));
  }
}
