package com.example.api_rest_refugio_de_animales_crud.repositories;

import com.example.api_rest_refugio_de_animales_crud.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository <Animal, Integer>{


    List<Animal> findByNombreContaining(String nombre);

    List<Animal> findByColorContaining(String color);

    List<Animal> findByEdadBetween(Integer edadDesde, Integer edadHasta);

}
