package com.rStyleSoftlab.businessCard.service;

import com.rStyleSoftlab.businessCard.dto.ResponsePersonDto;
import com.rStyleSoftlab.businessCard.entity.Person;
import com.rStyleSoftlab.businessCard.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page<ResponsePersonDto> findAll(String sortCriteria, int page, int size) {
        Page<Person> personsPage = personRepository.findAll(PageRequest.of(page, size, Sort.by(sortCriteria)));
        List<Person> personList = personsPage.toList();
        List<ResponsePersonDto> personDtos = new ArrayList<>();
        for (Person person : personList) {
            personDtos.add(new ResponsePersonDto(person.getName(), person.getLastName(), person.getAge(),
                    person.getSex(), person.getCity(), person.getPhoneNumbers(), person.getEmail(),
                    person.getCareerObjectives(), person.getEducations(), person.getExperiences(), person.getInterests(),
                    person.getSkills()));
        }
        return new PageImpl<>(personDtos);
    }

    @Override
    public Page<ResponsePersonDto> findByCity(String city, String sortCriteria, int page, int size) {
        Page<Person> personsByCityPage = personRepository.findByCity(city, PageRequest.of(page, size, Sort.by(sortCriteria)));
        List<Person> personList = personsByCityPage.toList();
        List<ResponsePersonDto> personDtos = new ArrayList<>();
        for (Person person : personList) {
            personDtos.add(new ResponsePersonDto(person.getName(), person.getLastName(), person.getAge(),
                    person.getSex(), person.getCity(), person.getPhoneNumbers(), person.getEmail(),
                    person.getCareerObjectives(), person.getEducations(), person.getExperiences(), person.getInterests(),
                    person.getSkills()));
        }
        return new PageImpl<>(personDtos);
    }

    @Override
    public Page<ResponsePersonDto> findByName(String name, String sortCriteria, int page, int size) {
        Page<Person> personsByNamePage = personRepository.findByName(name, PageRequest.of(page, size, Sort.by(sortCriteria)));
        List<Person> personList = personsByNamePage.toList();
        List<ResponsePersonDto> personDtos = new ArrayList<>();
        for (Person person : personList) {
            personDtos.add(new ResponsePersonDto(person.getName(), person.getLastName(), person.getAge(),
                    person.getSex(), person.getCity(), person.getPhoneNumbers(), person.getEmail(),
                    person.getCareerObjectives(), person.getEducations(), person.getExperiences(), person.getInterests(),
                    person.getSkills()));
        }
        return new PageImpl<>(personDtos);

    }
}
