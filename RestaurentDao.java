package com.Toy.Restaurent.dao;

import com.Toy.Restaurent.model.Restaurent;
import org.springframework.data.repository.CrudRepository;

public interface RestaurentDao extends CrudRepository<Restaurent,Integer> {
}
