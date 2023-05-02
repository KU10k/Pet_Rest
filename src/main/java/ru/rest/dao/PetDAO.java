package ru.rest.dao;



import ru.rest.models.Pet;

import java.util.List;

public interface PetDAO {
    List<Pet> getAll();

    Pet getById(int id);

    Pet saveOrUpdate(Pet pet);

    void delete(int id);
}
