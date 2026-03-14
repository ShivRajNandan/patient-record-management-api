package com.example.patientrecordapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String disease;
    private String doctorName;

    public Patient() {}

    public Patient(String name, int age, String disease, String doctorName) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.doctorName = doctorName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}