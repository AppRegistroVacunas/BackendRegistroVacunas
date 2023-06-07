package com.project.AppRegistroVacunas.Services;

import com.project.AppRegistroVacunas.Models.Persons;
import com.project.AppRegistroVacunas.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Persons> findAll() {
        return personRepository.findAll();
    }







}
