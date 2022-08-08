package com.example.daowithhibernate.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List getPersonByCity(String city){
        Query query=entityManager.createQuery("select p from Person p where p.cityOfLiving=:name");
        query.setParameter("name",city);
        return query.getResultList();
    }

}
