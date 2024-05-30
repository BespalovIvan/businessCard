package com.RStyleSoftlab.businessCard.entity;

import com.RStyleSoftlab.businessCard.dto.Sex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private UUID personId;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "sex",nullable = false)
    private Sex sex;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "phone_numbers",nullable = false)
    private Long phoneNumbers;
    @Column(name = "email",nullable = false)
    @Email
    private String email;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CareerObjective> careerObjectives;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Education> educations;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Interest> interests;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> skills;
}
