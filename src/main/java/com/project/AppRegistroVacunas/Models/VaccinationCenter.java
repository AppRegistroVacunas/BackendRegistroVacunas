package com.project.AppRegistroVacunas.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "VaccinationCenter")
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private Date date;
    @Column(name="address")
    private String address;


    public VaccinationCenter() {

    }

    public VaccinationCenter(Date date, String address) {
        this.date = date;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
