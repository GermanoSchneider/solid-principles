package com.example.single_responsibility.bad_implementation;

class App {

  public static void main(String[] args) {

    // All address information is over the person responsibility,
    // which it's wrong when we think about SRP

    Person person = new Person(
      "Dummy Name",
      "Dummy City",
      "Dummy Zip Code",
      123,
      "Dummy Street Name",
      "Dummy Country"
    );

    System.out.println(person.getDescription());
  }
}
