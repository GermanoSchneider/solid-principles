package org.example;

import java.math.BigDecimal;

class MassageChair extends Chair {

  MassageChair(ChairColor color, BigDecimal value) {
    super(color, value);
  }

  @Override
  public BigDecimal getValue() {

    return getUpdatedValue(new BigDecimal(15L));
  }
}
