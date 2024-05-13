package com.example.lsp;

import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    Animal animal = new Dog("Pitbull");
    FlyingAnimal bird = new Bird("Hawk");

    Collection<Animal> animals = List.of(animal, bird);

    // Both can eat
    animals.forEach(Animal::eat);

    // Only one can fly
    bird.fly();
  }
}