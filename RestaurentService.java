package com.Toy.Restaurent.service;

import com.Toy.Restaurent.model.Restaurent;
import java.util.List;
import java.util.Optional;

public interface RestaurentService {

    String bookRestro(List<Restaurent> restros);

    List<Restaurent> getRestros();

    Optional<Restaurent> getRestro(Integer restroId);
}
