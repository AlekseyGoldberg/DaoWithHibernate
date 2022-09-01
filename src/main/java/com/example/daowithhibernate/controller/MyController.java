package com.example.daowithhibernate.controller;

import com.example.daowithhibernate.entity.Person;
import com.example.daowithhibernate.service.MyService;
import jdk.net.SocketFlow;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class MyController {
    private final MyService service;

    public MyController(MyService service){
        this.service=service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getListPersonsByCity(@RequestParam String city){
        return service.getListPersonsByCity(city);
    }

    @PostMapping("/persons/by-age")
    public List<Person> getListPersonWhereAgeLessThat(int age){
        return service.getPersonWhereAgeLessThan(age);
    }
    @PostMapping(value = "/person/nameAndSurname")
    public Optional<Person> getPeronWithNameAndSurname(@RequestBody Person person){
        return service.getPeronWithNameAndSurname(person.getName(),person.getSurname());
    }

    @PostMapping(value = "/person/create")
    public Person createPerson(@RequestBody Person person){
        return service.savePerson(person);
    }

    @PostMapping(value = "/person/delete")
    public HttpEntity<String> deletePerson(@RequestBody Person person){
        service.deletePerson(person.getId());
        return new HttpEntity<>("ok");
    }

    @GetMapping("/listPersons")
    public List<Person> getListPersons(){
        return service.getListPersons();
    }

    @GetMapping("/getPerson")
    public Optional<Person> getPersonById(@RequestBody Person person){
        return service.getPerson(person.getId());
    }
}
