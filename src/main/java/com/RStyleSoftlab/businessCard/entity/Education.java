package com.rStyleSoftlab.businessCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rStyleSoftlab.businessCard.entity.enams.LevelOfEducation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "educations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "education_id")
    @JsonIgnore
    private UUID educationId;
    @Enumerated(EnumType.STRING)
    @Column(name = "level_of_education",nullable = false)
    private LevelOfEducation levelOfEducation;
    @Column(name = "name_of_the_institution",nullable = false)
    private String nameOfTheInstitution;
    @Column(name = "speciality",nullable = false)
    private String speciality;
    @Column(name = "start_date_of_studies",nullable = false)
    private LocalDate startDateOfStudies;
    @Column(name = "end_date_of_studies",nullable = false)
    private LocalDate endDateOfStudies;
    @JsonIgnore
    @Column(name = "person_id",nullable = false)
    private UUID personId;
}
