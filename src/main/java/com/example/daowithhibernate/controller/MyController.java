package com.example.daowithhibernate.controller;

import com.example.daowithhibernate.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    private final MyService service;

    public MyController(MyService service){
        this.service=service;
    }

    @GetMapping("/persons/by-city")
    public List getPersonsByCity(@RequestParam String city){
        return service.getPersonByCity(city);
    }
}
