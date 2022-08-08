package com.example.daowithhibernate.service;

import com.example.daowithhibernate.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final MyRepository repository;

    public MyService(MyRepository repository){
        this.repository=repository;
    }

    public List getPersonByCity(String city){
        return repository.getPersonByCity(city);
    }
}
