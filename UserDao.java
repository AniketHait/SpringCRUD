package com.Toy.Restaurent.dao;

import com.Toy.Restaurent.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User,Integer> {
}
