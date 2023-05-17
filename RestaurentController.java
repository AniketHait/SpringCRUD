package com.Toy.Restaurent.controller;

import com.Toy.Restaurent.model.Restaurent;
import com.Toy.Restaurent.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurentController {

    @Autowired
    private RestaurentService restaurentService;

    @PostMapping("/bookrestros")
    public String bookrestro(@RequestBody() List<Restaurent> restros){
        return restaurentService.bookRestro(restros);
    }

    @GetMapping("/getrestros")
    public List<Restaurent> bookrestro(){
        return restaurentService.getRestros();
    }

    @GetMapping("/getrestro")
    public Optional<Restaurent> bookrestro(@RequestParam("restroId") Integer restroId){
        return restaurentService.getRestro(restroId);
    }
}
