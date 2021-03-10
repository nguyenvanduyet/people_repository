package com.module4.service;

import com.module4.model.People;
import com.module4.repository.IPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService implements  IPeopleService{
    @Autowired
    private IPeopleRepository peopleRepository;

    @Override
    public List<People> findAll() {
        List<People> peopleList = (List<People>) peopleRepository.findAll();
        return peopleList;
    }

    @Override
    public Page<People> finAll(Pageable pageable) {
        return peopleRepository.findAll(pageable);
    }

    @Override
    public People findById(int id) {
        return peopleRepository.findOne(id);
    }

    @Override
    public void deletePeople(int id) {
        peopleRepository.delete(id);
    }

    @Override
    public People save(People people) {
        return peopleRepository.save(people);
    }
}
