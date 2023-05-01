package ru.rest.controllers;


import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import ru.rest.models.Pet;
import ru.rest.service.PetService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping("/pet")
    public List<Pet> getAllPet(){
        return petService.getAll();
    }

    @GetMapping("/pet/{id}")
    public Pet petInfo(@PathVariable("id") int id){
        Pet pet = petService.getById(id);
        return pet;
    }



}
