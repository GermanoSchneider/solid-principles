package org.example.with_solid;

import java.math.BigDecimal;

abstract class Device {

  private final String name;
  private final BigDecimal value;
  private final DeviceColor colors;

  protected Device(String name, BigDecimal value, DeviceColor colors) {
    this.name = name;
    this.value = value;
    this.colors = colors;
  }

  BigDecimal getValue() {

    if (colors.hasMoreThanOneColor()) value.add(new BigDecimal(5L));
    if (colors.hasGreenColor()) value.add(new BigDecimal(10L));

    return value;
  }

  String getName() {
    return name;
  }

  void switchOff() {
    System.out.println(name + " is switching off ...");
  }

  void switchOn() {
    System.out.println(name + " is switching on ...");
  }
}
