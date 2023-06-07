package com.project.AppRegistroVacunas.Models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="Persons")
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="dni")
    private Long dni;
    @Column(name="name")
    private String name;
    @Column(name="lastName")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="job")
    private String job;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="sex")
    private char sex;

    public Persons() {

    }

    public Persons( Long dni, String name, String lastname, String email, String job, Date birthday, char sex) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.job = job;
        this.birthday = birthday;
        this.sex = sex;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
