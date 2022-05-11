package com.example.project.Dao;

import com.example.project.model.Person;

import java.util.UUID;

public interface personDao {
    int insertPerson(UUID id , Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id , person);
    }
}
