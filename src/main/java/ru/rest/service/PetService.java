package ru.rest.service;



import ru.rest.models.Pet;

import java.util.List;

public interface PetService {
    List<Pet> getAll();

    Pet getById(int id);

    void saveOrUpdate(Pet pet);

    void delete(int id);
}
