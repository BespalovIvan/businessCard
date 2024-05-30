package com.rStyleSoftlab.businessCard.repository;

import com.rStyleSoftlab.businessCard.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, UUID> {
    Page<Person> findAll(Pageable pageable);
    Page<Person> findByName(String name,Pageable pageable);
    Page<Person> findByCity(String city,Pageable pageable);
}
