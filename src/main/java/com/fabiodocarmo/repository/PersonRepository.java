package com.fabiodocarmo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fabiodocarmo.model.Person;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstNameIgnoringCase(String firstName);

    List<Person> findByLastNameIgnoringCase(String lastName);

}