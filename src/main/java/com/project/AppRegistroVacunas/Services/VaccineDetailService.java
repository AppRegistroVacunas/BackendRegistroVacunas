package com.project.AppRegistroVacunas.Services;

import com.project.AppRegistroVacunas.Models.VaccineDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VaccineDetailService {
    List<VaccineDetail> findAll();
    String addVaccineDetail (VaccineDetail vaccineDetail);
    VaccineDetail findById(int id);
    String updateVaccineDetail (VaccineDetail vaccineDetail);
    String deleteVaccineDetail (int id);
}
