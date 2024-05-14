package com.example.dependency_inversion.bad_implementation;

import com.example.dependency_inversion.User;
import java.util.Collection;

public class UserService {

  private final MemoryRepository repository;

  public UserService(MemoryRepository repository) {
    this.repository = repository;
  }

  public User save(User user) {

    return repository.save(user);
  }

  public Collection<User> findAll() {

    return repository.findAll();
  }
}

