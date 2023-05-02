package ru.rest.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rest.dao.PetDAO;
import ru.rest.models.Pet;
import ru.rest.service.PetService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PetServiceImpl implements PetService {
    private final PetDAO petDAO;

    @Override
    @Transactional
    public List<Pet> getAll() {
        return petDAO.getAll();
    }

    @Override
    @Transactional
    public Pet getById(int id) {
        return petDAO.getById(id);
    }

    @Override
    @Transactional
    public Pet saveOrUpdate(Pet pet) {
        return petDAO.saveOrUpdate(pet);
    }

    @Override
    @Transactional
    public void delete(int id) {
     petDAO.delete(id);
    }
}
