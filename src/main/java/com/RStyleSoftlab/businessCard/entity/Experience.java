package com.rStyleSoftlab.businessCard.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "experiences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "experience_id")
    private UUID experienceId;
    @Column(name = "name_company",nullable = false)
    private String nameCompany;
    @Column(name = "job_title",nullable = false)
    private String jobTitle;
    @Column(name = "date_of_employment",nullable = false)
    private LocalDate dateOfEmployment;
    @Column(name = "date_of_dismissal",nullable = false)
    private LocalDate dateOfDismissal;
    @Column(name = "responsibilities",nullable = false)
    private String responsibilities;
    @Column(name = "person_id",nullable = false)
    private UUID personId;
}
