package org.example;

import java.awt.Color;
import java.math.BigDecimal;

class DeskChair extends Chair {

  DeskChair(Color color, BigDecimal value, Wheels wheels) {
    super(color, value, wheels);
  }

  @Override
  public BigDecimal getValue() {

    return isBlack()
        ? getValueWith(new BigDecimal(10L))
        : super.getValue();
  }

  private boolean isBlack() {

    return getColor() == Color.BLACK;
  }
}
