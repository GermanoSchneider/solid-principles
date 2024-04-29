package org.example.without_solid;

import static java.util.Arrays.asList;

import java.awt.Color;
import java.math.BigDecimal;

class Device {

  private final String name;
  private final BigDecimal value;
  private final Color[] colors;
  private final DeviceConnection connection;

  Device(String name, BigDecimal value, Color[] colors, DeviceConnection connection) {
    this.name = name;
    this.value = value;
    this.colors = colors;
    this.connection = connection;
  }

  private boolean hasMoreThanOneColor() {

    return colors.length > 1;
  }

  private boolean hasGreenColor() {

    return asList(colors).contains(Color.GREEN);
  }

  BigDecimal getValue() {

    if (hasMoreThanOneColor()) value.add(new BigDecimal(5));
    if (hasGreenColor()) value.add(new BigDecimal(10));
    if (connection == DeviceConnection.WIRELESS) value.add(new BigDecimal(50L));

    return value;
  }
}
