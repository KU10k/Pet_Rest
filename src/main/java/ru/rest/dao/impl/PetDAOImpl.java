package ru.rest.dao.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.rest.dao.PetDAO;
import ru.rest.models.Pet;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PetDAOImpl implements PetDAO {
    private final SessionFactory sessionFactory;


    @Override
    public List<Pet> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Pet> animal = session.createQuery("from Pet", Pet.class).getResultList();
        return animal;
    }

    @Override
    public Pet getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Pet pet = session.get(Pet.class, id);
        return pet;
    }

    @Override
    public void saveOrUpdate(Pet pet) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(pet);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getById(id));

    }
}
