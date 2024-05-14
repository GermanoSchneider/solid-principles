package com.example.dependency_inversion;

import java.util.Collection;

class UserService {

  private final UserRepository repository;

  UserService(UserRepository repository) {
    this.repository = repository;
  }

  User save(User user) {

    return repository.save(user);
  }

  Collection<User> findAll() {

    return repository.findAll();
  }
}

