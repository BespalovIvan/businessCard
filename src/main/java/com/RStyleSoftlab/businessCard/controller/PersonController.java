package com.rStyleSoftlab.businessCard.controller;

import com.rStyleSoftlab.businessCard.dto.ResponsePersonDto;
import com.rStyleSoftlab.businessCard.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("")
    public ResponseEntity<Page<ResponsePersonDto>> findAll(@RequestParam(defaultValue = "name") String sortCriteria,
                                                           @RequestParam(defaultValue = "0") int page,
                                                           @RequestParam(defaultValue = "3") int size) {
        return new ResponseEntity<>(personService.findAll(sortCriteria, page, size), HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Page<ResponsePersonDto>> findByName(@PathVariable("name") String name,
                                                              @RequestParam(defaultValue = "name") String sortCriteria,
                                                              @RequestParam(defaultValue = "0") int page,
                                                              @RequestParam(defaultValue = "3") int size) {
        return new ResponseEntity<>(personService.findByName(name, sortCriteria, page, size), HttpStatus.OK);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<Page<ResponsePersonDto>> findByCity(@PathVariable("city") String city,
                                                             @RequestParam(defaultValue = "name") String sortCriteria,
                                                             @RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "3") int size) {
        return new ResponseEntity<>(personService.findByCity(city, sortCriteria, page, size), HttpStatus.OK);
    }
}
