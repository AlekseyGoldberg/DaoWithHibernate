package com.example.daowithhibernate.repository;

import com.example.daowithhibernate.entity.Person;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MyRepository {
    private final MyJPAInterface jpaInterface;

    public MyRepository(MyJPAInterface jpaInterface) {
        this.jpaInterface = jpaInterface;
    }

    public Optional<Person> getPersonById(Long id){
        return jpaInterface.findById(id);
    }

    public void deletePersonById(Long id){jpaInterface.deleteById(id);}

    public Person savePerson(Person person){
        return jpaInterface.save(person);
    }

    public List<Person> getPersonByCity(String city){
      return jpaInterface.findByCityOfLiving(city);
    }

    public List<Person> getPersonWhereAgeLessThan(int age){
        return jpaInterface.findAllByAgeLessThan(age, Sort.by("age"));
    }

    public Optional<Person> getPeronWithNameAndSurname(String name,String surname){

        return jpaInterface.findAllByNameAndSurname(name,surname);
    }
    public List<Person> getListPersons(){
        return jpaInterface.findAll();
    }
}
