package org.example;

import java.math.BigDecimal;

abstract class Chair {

    private final ChairColor color;
    private final BigDecimal value;

    Chair(ChairColor color, BigDecimal value) {
      this.color = color;
      this.value = value;
    }

    protected BigDecimal getUpdatedValue(BigDecimal tax) {

      return color.hasMoreThanOneColor()
          ? value.add(tax)
          : value;
    }

    protected BigDecimal getValue() {
      return value;
    }

    protected ChairColor getColor() {
      return color;
    }
}
