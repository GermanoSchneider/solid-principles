package com.example.open_closed;

import java.math.BigDecimal;

class Electronic extends Product {

  Electronic(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(15));
  }
}
