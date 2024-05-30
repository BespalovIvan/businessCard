package com.rStyleSoftlab.businessCard.entity;

import com.rStyleSoftlab.businessCard.entity.enams.Employment;
import com.rStyleSoftlab.businessCard.entity.enams.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "career_objectives")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CareerObjective {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "career_objective_id")
    private UUID careerObjectiveId;
    @Column(name = "job_title",nullable = false)
    private String jobTitle;
    @Column(name = "employment",nullable = false)
    private Employment employment;
    @Column(name = "schedule",nullable = false)
    private Schedule schedule;
    @Column(name = "salary",nullable = false)
    private BigDecimal salary;

}
