package com.example.liskov_substitution.bad_implementation;

abstract class Animal {

  private final String name;

  protected Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println("Animal is eating ...");
  }

  void fly() {
    System.out.println("Animal is flying ...");
  }
}
