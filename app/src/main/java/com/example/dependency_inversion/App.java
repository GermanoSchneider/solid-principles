package com.example.dependency_inversion;

class App {

  public static void main(String[] args) {

    // UserService is prepared to inject whatever the UserRepository is,
    // which is an interface that invert the dependency on any repository who implements it.

    UserRepository repository = new MemoryRepository();
    UserService service = new UserService(repository);

    service.save(new User("dummy"));

    service
        .findAll()
        .stream()
        .map(User::getName).forEach(System.out::println);
  }
}
