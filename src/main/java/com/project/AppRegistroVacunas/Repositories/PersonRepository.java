package com.project.AppRegistroVacunas.Repositories;

import ch.qos.logback.core.net.server.Client;
import com.project.AppRegistroVacunas.Models.Persons;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Persons,Integer> {

    @Query(value="from Persons where")
    List<Persons> findAll();

}
