package com.example.open_closed;

import java.math.BigDecimal;

class Kitchen extends Product {

  Kitchen(String name, BigDecimal value) {
    super(name, value);
  }

  @Override
  public BigDecimal getValue() {

    return addTax(new BigDecimal(5));
  }
}
