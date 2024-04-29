package org.example.with_solid;

import java.math.BigDecimal;

abstract class WirelessDevice extends Device {

  protected WirelessDevice(String name, BigDecimal value, DeviceColor colors) {
    super(name, value, colors);
  }

  @Override
  BigDecimal getValue() {

    return super.getValue().add(new BigDecimal(50L));
  }

  void charge() {
    System.out.println(getName() + "is charging ...");
  }
}
