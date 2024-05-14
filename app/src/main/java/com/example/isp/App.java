package com.example.isp;

class App {

  public static void main(String[] args) {

    // Laptop is the only that we can charge, that's why we
    // created another interface only with the charge action

    Device desktop = new Desktop();
    PortableDevice laptop = new Laptop();

    desktop.powerOn();
    desktop.powerOff();

    laptop.charge();
    laptop.powerOn();
    laptop.powerOff();
  }
}
