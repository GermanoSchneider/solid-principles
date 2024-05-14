package com.example.dependency_inversion;

import java.util.ArrayList;
import java.util.Collection;

class MemoryRepository implements UserRepository {

  private static final Collection<User> users = new ArrayList<>();

  @Override
  public User save(User user) {
    users.add(user);
    return user;
  }

  @Override
  public Collection<User> findAll() {
    return users;
  }
}
