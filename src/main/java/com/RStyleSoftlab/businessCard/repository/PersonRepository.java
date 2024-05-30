package com.rStyleSoftlab.businessCard.repository;

import com.rStyleSoftlab.businessCard.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {
}
