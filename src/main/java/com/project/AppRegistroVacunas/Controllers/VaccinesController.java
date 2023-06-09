package com.project.AppRegistroVacunas.Controllers;

import com.project.AppRegistroVacunas.Models.Vaccines;
import com.project.AppRegistroVacunas.Services.VaccinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vaccines/v0")
public class VaccinesController {
    @Autowired
    private VaccinesService vaccinesService;

    public VaccinesController(VaccinesService vaccinesService){
        this.vaccinesService = vaccinesService;
    }
    @GetMapping("/vaccines")
    public List<Vaccines> findAll(){
        return vaccinesService.findAll();
    }

    @PostMapping("/vaccines")
    @ResponseBody
    public String save ( @RequestBody Vaccines vaccines){
        return vaccinesService.addVaccines(vaccines);
    }

    @GetMapping("/vaccines/{id}")
    @ResponseBody
    public Vaccines findId(@PathVariable int id){
        return vaccinesService.findById(id);
    }

    @PutMapping("/vaccines")
    @ResponseBody
    public  String update (@RequestBody Vaccines vaccines){
        return vaccinesService.updateVaccines(vaccines);
    }
    @GetMapping("/vaccines/{id}")
    @ResponseBody
    public String update (@PathVariable int id){
        return vaccinesService.deleteVaccines(id);
    }


}



















