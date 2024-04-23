package org.example;

class Wheels {

  private final int quantity;

  Wheels(int quantity) {
    this.quantity = quantity;
  }

  boolean hasAtLeastFiveWheels() {

    return quantity >= 5;
  }
}
