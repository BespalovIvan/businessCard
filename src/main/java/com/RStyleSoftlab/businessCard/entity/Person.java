package com.rStyleSoftlab.businessCard.entity;

import com.rStyleSoftlab.businessCard.entity.enams.Sex;
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
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "age",nullable = false)
    private Integer age;
    @Enumerated(EnumType.STRING)
    @Column(name = "sex",nullable = false)
    private Sex sex;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "phone_number",nullable = false)
    private Long phoneNumbers;
    @Column(name = "email",nullable = false)
    @Email(regexp = "^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<CareerObjective> careerObjectives;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Education> educations;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Experience> experiences;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Interest> interests;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Skill> skills;
}
