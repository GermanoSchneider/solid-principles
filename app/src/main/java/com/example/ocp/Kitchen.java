package com.example.ocp;

import java.math.BigDecimal;

public class Kitchen extends Product {

  public Kitchen(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(5));
  }
}
