package com.example.srp;

class App {

  public static void main(String[] args) {

    // Address and Person information are decoupled from each other,
    // dividing responsibilities

    Address address = new Address("Burnaby", "V5G", 4330, "Sanderson Way", "Canada");
    Person person = new Person("Dummy", address);

    System.out.println(person.getDescription());
  }
}
