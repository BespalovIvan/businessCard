package com.RStyleSoftlab.businessCard.entity;

import com.RStyleSoftlab.businessCard.dto.ProficiencyLevel;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private UUID skillId;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "proficiency_level",nullable = false)
    private ProficiencyLevel proficiencyLevel;
}
