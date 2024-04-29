package org.example.with_solid;

class DeviceServiceImpl implements DeviceService {

  @Override
  public void turnOn(Device device) {

    device.switchOn();
  }

  @Override
  public void turnOff(Device device) {

    device.switchOff();
  }
}
