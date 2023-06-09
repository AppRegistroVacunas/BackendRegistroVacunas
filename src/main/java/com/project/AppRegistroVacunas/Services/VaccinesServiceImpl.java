package com.project.AppRegistroVacunas.Services;

import com.project.AppRegistroVacunas.Models.Vaccines;
import com.project.AppRegistroVacunas.Repositories.VaccinesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VaccinesServiceImpl implements VaccinesService {

    @Autowired
    VaccinesRepository vaccinesRepository;

    @Override
    public List<Vaccines> findAll(){
        return vaccinesRepository.findAll();
    }

    @Override
    @Transactional
    public String addVaccines(Vaccines vaccines) {
        int id=vaccines.getId();
        String name=vaccines.getName();
        String madeIn=vaccines.getMadeIn();
        String madeBy=vaccines.getMadeBy();
        String againsTo=vaccines.getAgainstTo();
        Date creationDate=vaccines.getCreationDate();
        Date dueDate=vaccines.getDueDate();

        vaccinesRepository.addVaccines(id,name,madeIn,madeBy,againsTo,creationDate,dueDate);

        try {
            return "the operation was successful";
        }catch (Error e){
            return e.getMessage();
        }
    }

    @Override
    public Vaccines findById(int id) {
        return  vaccinesRepository.findById(id);
    }


    @Override
    @Transactional
    public String updateVaccines(Vaccines vaccines) {
        int id=vaccines.getId();
        String name=vaccines.getName();
        String madeIn=vaccines.getMadeIn();
        String madeBy=vaccines.getMadeBy();
        String againsTo=vaccines.getAgainstTo();
        Date creationDate=vaccines.getCreationDate();
        Date dueDate=vaccines.getDueDate();

        vaccinesRepository.addVaccines(id,name,madeIn,madeBy,againsTo,creationDate,dueDate);
        /*String name=vaccines.getName();
        String made_in=vaccines.getMadeIn();
        String made_by=vaccines.getMadeBy();
        String against_to=vaccines.getAgainstTo();
        Date creation_date=vaccines.getCreationDate();
        Date due_date=vaccines.getDueDate();

        vaccinesRepository.addVaccines(id,name,made_in,made_by,against_to,creation_date,due_date);*/

        try {
            return "the operation was successful";
        }catch (Error e){
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String deleteVaccines(int id) {
        vaccinesRepository.deleteVaccine(id);
        try {
            return "was removed successful";
        }catch (Error e){
            return e.getMessage();
        }
    }

}
