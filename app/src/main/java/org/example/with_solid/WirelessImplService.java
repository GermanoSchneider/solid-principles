package org.example.with_solid;

class WirelessImplService implements WirelessDeviceService {

  @Override
  public void turnOn(Device device) {

    device.switchOn();
  }

  @Override
  public void turnOff(Device device) {

    device.switchOff();
  }

  @Override
  public void charge(WirelessDevice wirelessDevice) {

    wirelessDevice.charge();
  }
}
