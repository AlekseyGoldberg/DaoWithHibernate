package com.example.daowithhibernate.service;

import com.example.daowithhibernate.entity.Person;
import com.example.daowithhibernate.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    private final MyRepository repository;

    public MyService(MyRepository repository){
        this.repository=repository;
    }
    public List<Person> getListPersonsByCity(String city){
        return repository.getPersonByCity(city);
    }

    public List<Person> getPersonWhereAgeLessThan(int age){
        return repository.getPersonWhereAgeLessThan(age);
    }

    public Person savePerson(Person person){
        return repository.savePerson(person);
    }

    public void deletePerson(long id){
        repository.deletePersonById(id);
    }

    public Optional<Person> getPeronWithNameAndSurname(String name,String surname){
       return repository.getPeronWithNameAndSurname(name,surname);
    }

    public List<Person> getListPersons(){
        return repository.getListPersons();
    }

    public Optional<Person> getPerson(Long id){
        return repository.getPersonById(id);
    }
}
