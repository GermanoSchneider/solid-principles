package com.example.dependency_inversion.bad_implementation;

import com.example.dependency_inversion.User;

class App {

  public static void main(String[] args) {

    // UserService is only prepared to inject the memory repository,
    // which is a concrete implementation, but what if a new database repository was created?
    // We must invert dependencies.

    MemoryRepository repository = new MemoryRepository();
    UserService service = new UserService(repository);

    service.save(new User("dummy"));

    service
        .findAll()
        .stream()
        .map(User::getName).forEach(System.out::println);
  }
}
