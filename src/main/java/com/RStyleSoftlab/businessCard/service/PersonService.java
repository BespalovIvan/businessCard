package com.rStyleSoftlab.businessCard.service;

import com.rStyleSoftlab.businessCard.dto.ResponsePersonDto;
import org.springframework.data.domain.Page;

public interface PersonService {
    Page<ResponsePersonDto> findAll(String sortCriteria,int page,int size);
    Page<ResponsePersonDto> findByName(String name, String sortCriteria, int page,int size);
    Page<ResponsePersonDto> findByCity(String city, String sortCriteria, int page,int size);

}
