package org.example;

import java.awt.Color;
import java.math.BigDecimal;

abstract class Chair {

    private final Color color;
    private final BigDecimal value;
    private final Wheels wheels;

    Chair(Color color, BigDecimal value, Wheels wheels) {
      this.color = color;
      this.value = value;
      this.wheels = wheels;
    }

    protected boolean isRotating() {
      return wheels.hasAtLeastFiveWheels();
    }

    protected BigDecimal getValueWith(BigDecimal tax) {
      return value.add(tax);
    }

    protected BigDecimal getValue() {
      return value;
    }

    protected Color getColor() {
      return color;
    }
}
