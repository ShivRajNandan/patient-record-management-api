package com.example.patientrecordapplication.repository;

import com.example.patientrecordapplication.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}