package com.example.lsp;

import java.util.Collection;
import java.util.List;

class App {

  public static void main(String[] args) {

    // All animals can eat, but only birds can fly

    Animal animal = new Dog("Pitbull");
    FlyingAnimal bird = new Bird("Hawk");

    Collection<Animal> animals = List.of(animal, bird);

    animals.forEach(Animal::eat);
    bird.fly();
  }
}
