package com.example.liskov_substitution;

abstract class Animal {

  private final String name;

  protected Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println("Animal is eating ...");
  }
}
