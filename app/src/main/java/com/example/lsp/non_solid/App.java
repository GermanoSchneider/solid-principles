package com.example.lsp.non_solid;

import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    Animal dog = new Dog("Pitbull");
    Animal bird = new Bird("Hawk");

    Collection<Animal> animals = List.of(dog, bird);

    // Both can eat
    animals.forEach(Animal::eat);

    // But only the bird should fly
    animals.forEach(Animal::fly);
  }
}
