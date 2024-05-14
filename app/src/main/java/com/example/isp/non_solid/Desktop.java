package com.example.isp.non_solid;

class Desktop implements Device {

  @Override
  public void powerOn() {
    System.out.println("desktop is powering on");
  }

  @Override
  public void powerOff() {
    System.out.println("desktop is powering off");
  }

  @Override
  public void charge() {
    throw new RuntimeException("It's not possible to charge a desktop computer");
  }
}
