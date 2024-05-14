package com.example.single_responsibility;

class Person {

  private final String name;
  private final Address address;

  Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  String getDescription() {

    return String.format("Hi! I'm %s and my address is:\n\n%s", name, address.format());
  }
}
