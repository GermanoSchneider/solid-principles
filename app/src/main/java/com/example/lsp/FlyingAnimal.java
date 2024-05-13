package com.example.lsp;

abstract class FlyingAnimal extends Animal {

  protected FlyingAnimal(String name) {
    super(name);
  }

  void fly() {
    System.out.println("Animal is flying ...");
  }
}
