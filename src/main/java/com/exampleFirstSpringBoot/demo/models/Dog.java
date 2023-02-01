package com.exampleFirstSpringBoot.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//los modelos en spring boot se llaman entity
@Table(name ="dogs")
//Table el name  deben ir en plural
public class Dog {
    //clave primaria para esta tabla se la indicamos asi

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_dog")
    Long id;

   //esta dice que nombre tendra la columna name
    @Column(name= "name")
    String name;

    //colocamos un constructor
    public Dog(String name) {
        this.name = name;
    }

    //setters y getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
