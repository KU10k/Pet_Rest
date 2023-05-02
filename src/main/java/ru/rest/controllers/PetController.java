package ru.rest.controllers;


import lombok.RequiredArgsConstructor;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;
import ru.rest.exception_handler.NoSuchPetException;
import ru.rest.models.Pet;
import ru.rest.service.PetService;
import ru.rest.utils.ControllerUtils;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping("/")
    public List<Pet> getAllPet() {
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public Pet petInfo(@PathVariable("id") int id) throws NoSuchPetException {
        Pet pet = petService.getById(id);
        if (pet == null) throw new NoSuchPetException("Pet with id = " + id + " is not found");
        return pet;
    }

    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody Pet pets, BindingResult result) {
        Map<String, String> errors = ControllerUtils.getErrors(result);
        if (!errors.isEmpty()) return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);

        Pet pet = petService.saveOrUpdate(pets);
        return new ResponseEntity<>(pet, HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@Valid @RequestBody Pet pets, BindingResult result) throws NoSuchPetException {
        Pet pet = petService.getById(pets.getId());
        if (pet == null) throw new NoSuchPetException("Pet with id = " + pets.getId() +" is not found");

        Map<String, String> errors = ControllerUtils.getErrors(result);
        if (!errors.isEmpty()) return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);

        Pet p = petService.saveOrUpdate(pets);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) throws NoSuchPetException {
        Pet pet = petService.getById(id);
        if (pet == null) throw new NoSuchPetException("Pet with id = " + id + " is not found");
        petService.delete(id);
        return new ResponseEntity<>("Delete employee with id " + id, HttpStatus.OK);
    }

}
