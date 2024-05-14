package com.example.isp;

class Laptop implements PortableDevice {

  @Override
  public void powerOn() {
    System.out.println("laptop is powering on");
  }

  @Override
  public void powerOff() {
    System.out.println("laptop is powering off");
  }

  @Override
  public void charge() {
    System.out.println("laptop is charging");
  }
}
