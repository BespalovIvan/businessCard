package com.rStyleSoftlab.businessCard.controller;

import com.rStyleSoftlab.businessCard.entity.Person;
import com.rStyleSoftlab.businessCard.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> findAll() {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }
}
