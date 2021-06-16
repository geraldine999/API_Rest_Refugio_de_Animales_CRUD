package com.example.api_rest_refugio_de_animales_crud.services;

import com.example.api_rest_refugio_de_animales_crud.entities.Animal;
import com.example.api_rest_refugio_de_animales_crud.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public List<Animal> buscarAnimalesQueContenganNombre(String nombre) {
        return animalRepository.findByNombreContaining(nombre);
    }

    public List<Animal> buscarAnimalesQueContenganColor(String color) {
        return animalRepository.findByColorContaining(color);
    }

    public List<Animal> buscarAnimalesEntreEdades(Integer edadDesde, Integer edadHasta) {
        return animalRepository.findByEdadBetween(edadDesde, edadHasta);
    }

    public Optional<Animal> buscarAnimalPorId(Integer id) {
        return animalRepository.findById(id);
    }

    public Animal guardarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public void eliminarAnimalPorId(Integer id) {
        if(!animalRepository.existsById(id)) {
            throw new IllegalStateException("El animal no existe");
        }else{
            animalRepository.deleteById(id);
        }
    }
}
