package com.example.dependency_inversion;

import java.util.Collection;

interface UserRepository {
  User save(User user);
  Collection<User> findAll();
}
