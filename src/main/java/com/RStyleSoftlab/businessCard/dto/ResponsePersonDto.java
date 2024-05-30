package com.rStyleSoftlab.businessCard.dto;

import com.rStyleSoftlab.businessCard.entity.*;
import com.rStyleSoftlab.businessCard.entity.enams.Sex;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePersonDto {
    private String name;
    private String lastName;
    private Integer age;
    private Sex sex;
    private String city;
    private Long phoneNumbers;
    private String email;
    private List<CareerObjective> careerObjectives;
    private List<Education> educations;
    private List<Experience> experiences;
    private List<Interest> interests;
    private List<Skill> skills;
}
