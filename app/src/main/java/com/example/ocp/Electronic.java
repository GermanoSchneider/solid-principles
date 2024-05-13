package com.example.ocp;

import java.math.BigDecimal;

public class Electronic extends Product {

  public Electronic(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(15));
  }
}
