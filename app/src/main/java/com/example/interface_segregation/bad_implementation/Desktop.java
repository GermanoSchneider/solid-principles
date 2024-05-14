package com.example.interface_segregation.bad_implementation;

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
