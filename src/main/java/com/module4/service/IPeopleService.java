package com.module4.service;

import com.module4.model.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPeopleService {
    List<People> findAll();
    Page<People> finAll(Pageable pageable);
    People findById(int id);
    void deletePeople(int id);
    People save (People people);

}
