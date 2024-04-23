package org.example;

import java.awt.Color;
import java.math.BigDecimal;

class KitchenChair extends Chair {

  KitchenChair(Color color, BigDecimal value, Wheels wheels) {
    super(color, value, wheels);
  }

  @Override
  public BigDecimal getValue() {

    return isWhite()
        ? getValueWith(new BigDecimal(5L))
        : super.getValue();
  }

  private boolean isWhite() {

    return getColor() == Color.WHITE;
  }
}
