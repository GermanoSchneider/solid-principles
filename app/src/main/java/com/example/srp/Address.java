package com.example.srp;

class Address {

  private final String city;
  private final String postalCode;
  private final Integer number;
  private final String street;
  private final String country;

  Address(String city, String postalCode, Integer number, String street, String country) {
    this.city = city;
    this.postalCode = postalCode;
    this.number = number;
    this.street = street;
    this.country = country;
  }

  String format() {

    return String.format("%s %s\n%s %s\n%s",
        number,
        street,
        postalCode,
        city,
        country
    );
  }
}
