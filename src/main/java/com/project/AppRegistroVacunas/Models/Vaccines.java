package com.project.AppRegistroVacunas.Models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Vaccines")
public class Vaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "made_in")
    private String madeIn;
    @Column(name="brand")
    private String brand;
    @Column(name = "against_to")
    private String againstTo;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "due_date")
    private Date dueDate;

    public Vaccines(){

    }

    public Vaccines(String name, String madeIn, String brand, String againstTo, Date creationDate, Date dueDate) {
        this.name = name;
        this.madeIn = madeIn;
        this.brand = brand;
        this.againstTo = againstTo;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAgainstTo() {
        return againstTo;
    }

    public void setAgainstTo(String againstTo) {
        this.againstTo = againstTo;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
