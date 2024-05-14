package com.example.isp.non_solid;

class App {

  public static void main(String[] args) {

    // Only laptop should charge, we are forcing desktop to do something unusual for it.

    Device desktop = new Desktop();
    Device laptop = new Laptop();

    laptop.charge();
    laptop.powerOn();
    laptop.powerOff();

    desktop.charge();
    desktop.powerOn();
    desktop.powerOff();
  }
}
