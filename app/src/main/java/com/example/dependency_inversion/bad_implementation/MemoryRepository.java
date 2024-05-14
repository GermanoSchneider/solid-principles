package com.example.dependency_inversion.bad_implementation;

import com.example.dependency_inversion.User;
import java.util.ArrayList;
import java.util.Collection;

class MemoryRepository {

  private static final Collection<User> users = new ArrayList<>();

  public User save(User user) {
    users.add(user);
    return user;
  }

  public Collection<User> findAll() {
    return users;
  }
}
