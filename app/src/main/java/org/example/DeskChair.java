package org.example;

import java.math.BigDecimal;

class DeskChair extends Chair {

  DeskChair(ChairColor color, BigDecimal value) {
    super(color, value);
  }

  @Override
  public BigDecimal getValue() {

    return getUpdatedValue(new BigDecimal(10L));
  }
}
