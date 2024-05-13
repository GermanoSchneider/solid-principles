package com.example.srp.non_solid;

class Person {

  private final String name;
  private final String city;
  private final String zipCode;
  private final Integer streetNumber;
  private final String streetName;
  private final String country;

  Person(String name, String city, String zipCode, Integer streetNumber, String streetName,
      String country) {
    this.name = name;
    this.country = country;
    this.city = city;
    this.zipCode = zipCode;
    this.streetNumber = streetNumber;
    this.streetName = streetName;
  }

  String getDescription() {

    return String.format("Hi! I'm %s and my address is:\n\n%s", name, getFormattedAddress());
  }

  private String getFormattedAddress() {
    return String.format("%s %s\n%s %s\n%s", streetNumber, streetName, zipCode, city, country);
  }
}
