package com.rStyleSoftlab.businessCard.entity;

import com.rStyleSoftlab.businessCard.entity.enams.ProficiencyLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "skills")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private UUID skillId;
    @Column(name = "name",nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "proficiency_level",nullable = false)
    private ProficiencyLevel proficiencyLevel;
    @Column(name = "person_id",nullable = false)
    private UUID personId;
}
