package com.example.ocp;

import java.math.BigDecimal;

class Automotive extends Product {

  Automotive(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(10));
  }
}
