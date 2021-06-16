package com.example.api_rest_refugio_de_animales_crud.entities;

import javax.persistence.*;

@Entity
@Table(name="animales")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_animal;
    private String nombre;
    private Integer edad;
    private String color;

    public Animal() {
    }

    public Animal(Integer id_animal, Integer edad, String color, String nombre) {
        this.id_animal = id_animal;
        this.edad = edad;
        this.color = color;
        this.nombre = nombre;
    }

    public Animal(Integer edad, String color, String nombre) {
        this.edad = edad;
        this.color = color;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id_animal=" + id_animal +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}
