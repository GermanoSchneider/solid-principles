package org.example.srp;

class Address {

  private final String city;
  private final String zipCode;
  private final Integer streetNumber;
  private final String streetName;
  private final String country;

  Address(String city, String zipCode, Integer streetNumber, String streetName, String country) {
    this.city = city;
    this.zipCode = zipCode;
    this.streetNumber = streetNumber;
    this.streetName = streetName;
    this.country = country;
  }

  String format() {

    return String.format("%s %s\n%s %s\n%s",
        streetNumber,
        streetName,
        zipCode,
        city,
        country
    );
  }
}
