package com.example.isp;

class Desktop implements Device {

  @Override
  public void powerOn() {
    System.out.println("desktop is powering on");
  }

  @Override
  public void powerOff() {
    System.out.println("desktop is powering off");
  }
}
