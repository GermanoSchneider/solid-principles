package com.example.lsp.non_solid;

import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    // All animals can eat, but dogs should not be able to fly

    Animal dog = new Dog("Pitbull");
    Animal bird = new Bird("Hawk");

    Collection<Animal> animals = List.of(dog, bird);

    animals.forEach(Animal::eat);
    animals.forEach(Animal::fly);
  }
}
