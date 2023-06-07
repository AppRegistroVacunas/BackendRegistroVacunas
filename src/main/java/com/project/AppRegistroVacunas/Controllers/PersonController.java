package com.project.AppRegistroVacunas.Controllers;


import com.project.AppRegistroVacunas.Models.Persons;
import com.project.AppRegistroVacunas.Repositories.PersonRepository;
import com.project.AppRegistroVacunas.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
     PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/persons")
    public List<Persons> findAll(){
        return personService.findAll();
    }


 //   @Autowired


}
