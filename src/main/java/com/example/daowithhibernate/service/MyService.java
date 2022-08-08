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

    public List getProductByName(String name){
        return repository.getProductByName(name);
    }
}
