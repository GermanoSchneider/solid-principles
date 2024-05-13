package com.example.srp;

public class Person {

  private final String name;
  private final Address address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public String getDescription() {

    return String.format("Hi! I'm %s and my address is:\n\n%s", name, address.format());
  }
}
