package com.example.api_rest_refugio_de_animales_crud.controllers;

import com.example.api_rest_refugio_de_animales_crud.entities.Animal;
import com.example.api_rest_refugio_de_animales_crud.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("animales")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> mostrarAnimales(){
        return animalService.findAll();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Animal> buscarAnimalesQueContenganNombre(@PathVariable String nombre){
        return animalService.buscarAnimalesQueContenganNombre(nombre);
    }

    @GetMapping("/color/{color}")
    public List<Animal> buscarAnimalesPorColor(@PathVariable String color){
        return animalService.buscarAnimalesQueContenganColor(color);
    }


    @GetMapping("/edad/{edadDesde}/{edadHasta}")
    public List<Animal> buscarAnimalesEntreEdades(@PathVariable Integer edadDesde, @PathVariable Integer edadHasta){
        return animalService.buscarAnimalesEntreEdades(edadDesde, edadHasta);
    }

    @GetMapping("id/{id}")
        public Optional <Animal> buscarAnimalPorId(@PathVariable Integer id){
            return animalService.buscarAnimalPorId(id);
        }

        @PostMapping("crear")
    public Animal crearAnimal(@RequestBody Animal animal){
        return animalService.guardarAnimal(animal);
        }

        @DeleteMapping("eliminar/id/{id}")
    public String eliminarAnimalPorId(@PathVariable Integer id){
        animalService.eliminarAnimalPorId(id);
        return "eliminado";
        }

        //TODO EDITAR




}
