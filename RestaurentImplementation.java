package com.Toy.Restaurent.service;


import com.Toy.Restaurent.dao.RestaurentDao;
import com.Toy.Restaurent.model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RestaurentImplementation implements RestaurentService {
    @Autowired
    private RestaurentDao restroDao;


    @Override
    public String bookRestro(List<Restaurent> restros) {
        restroDao.saveAll(restros);
        return "Succesfully saved restaurants"+restros.size();
    }

    @Override
    public List<Restaurent> getRestros() {
        return (List<Restaurent>)restroDao.findAll();
    }

    @Override
    public Optional<Restaurent> getRestro(Integer restroId) {
        return (Optional<Restaurent>) restroDao.findById(restroId);
    }
}
