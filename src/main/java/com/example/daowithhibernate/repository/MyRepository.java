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

    public List getProductByName(String name){
        Query query=entityManager.createQuery("select o.productName from Orders o join Customers c on o.customer.id=c.id where lower( c.name)=:name");
        query.setParameter("name",name.toLowerCase());
        return query.getResultList();
    }

}
