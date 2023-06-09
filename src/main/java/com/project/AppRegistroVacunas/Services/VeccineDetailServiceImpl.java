package com.project.AppRegistroVacunas.Services;


import com.project.AppRegistroVacunas.Models.VaccineDetail;
import com.project.AppRegistroVacunas.Repositories.VaccineDetailReposi;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VeccineDetailServiceImpl implements VaccineDetailService {
    @Autowired
    VaccineDetailReposi vaccineDetailReposi;
    @Override
    public List<VaccineDetail> findAll(){
        return vaccineDetailReposi.findAll();
    }

    @Override
    @Transactional
    public String addVaccineDetail(VaccineDetail vaccineDetail) {
        int id=vaccineDetail.getId();
        Date date=vaccineDetail.getDate();
        String place=vaccineDetail.getPlace();

        vaccineDetailReposi.addVaccineDetail(id,date,place);
        try{
            return "the operation was successful";
        }catch (Error e){
            return e.getMessage();
        }
    }

    @Override
    public VaccineDetail findById(int id) {
        return vaccineDetailReposi.findById(id);
    }

    @Override
    @Transactional
    public String updateVaccineDetail(VaccineDetail vaccineDetail) {
        int id=vaccineDetail.getId();
        Date date=vaccineDetail.getDate();
        String place=vaccineDetail.getPlace();

        vaccineDetailReposi.addVaccineDetail(id,date,place);
        try{
            return "the operation was successful";
        }catch (Error e){
            return e.getMessage();
        }

    }

    @Override
    @Transactional
    public String deleteVaccineDetail(int id) {
        vaccineDetailReposi.deleteVaccineDetail(id);
        try {
            return "was removed successful";
        }catch (Error e){
            return e.getMessage();
        }
    }

}
