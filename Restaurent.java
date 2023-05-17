package com.Toy.Restaurent.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurent")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Restaurent {

    @Id
    @GeneratedValue
    private int rid;
    private String rname;
    private String rlocation;
}
