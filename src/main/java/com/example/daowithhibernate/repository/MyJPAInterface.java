package com.example.daowithhibernate.repository;

import com.example.daowithhibernate.entity.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.DataTruncation;
import java.util.List;
import java.util.Optional;

public interface MyJPAInterface extends JpaRepository<Person, Long> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findAllByAgeLessThan(int age, Sort sort);

    Optional<Person> findAllByNameAndSurname(String name,String surname);
}
