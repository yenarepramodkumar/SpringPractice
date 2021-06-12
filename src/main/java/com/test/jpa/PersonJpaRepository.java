package com.test.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id)
    {
        return entityManager.find(Person.class, id);
    }
    public List<Person> findAllPerson()
    {
        TypedQuery<Person> namedQuery = (TypedQuery<Person>) entityManager.createNamedQuery("find_all_persons");
        return namedQuery.getResultList();
    }

    public Person insert(Person p)
    {
        return entityManager.merge(p);
    }
    public Person update(Person p)
    {
        return entityManager.merge(p);
    }
    public void deleteById(int id)
    {
        entityManager.remove(findById(id));
    }

    
}
