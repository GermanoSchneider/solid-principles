package org.example.with_solid;

import static java.awt.Color.GREEN;
import static java.util.Arrays.asList;

import java.awt.Color;

class DeviceColor {

  private final Color[] colors;

  DeviceColor(Color... colors) {
    this.colors = colors;
  }

  boolean hasMoreThanOneColor() {

    return colors.length > 1;
  }

  boolean hasGreenColor() {

    return asList(colors).contains(GREEN);
  }

}
