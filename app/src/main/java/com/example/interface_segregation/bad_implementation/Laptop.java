package com.example.interface_segregation.bad_implementation;

class Laptop implements Device {

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
