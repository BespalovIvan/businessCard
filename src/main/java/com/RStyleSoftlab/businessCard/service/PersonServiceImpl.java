package com.rStyleSoftlab.businessCard.service;

import com.rStyleSoftlab.businessCard.entity.Person;
import com.rStyleSoftlab.businessCard.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
