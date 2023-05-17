package com.Toy.Restaurent.service;

import com.Toy.Restaurent.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String saveUsers(List<User> users);
    Optional<User> getUser(Integer userId);
    List<User> getUsers();
    String deleteUser(Integer id);
    String updateUser(User user);
}
