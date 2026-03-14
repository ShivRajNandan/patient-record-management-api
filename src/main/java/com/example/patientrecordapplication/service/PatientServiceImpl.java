package com.example.patientrecordapplication.service;

import com.example.patientrecordapplication.entity.Patient;
import com.example.patientrecordapplication.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    @Override
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {

        Patient existing = getPatientById(id);

        existing.setName(patient.getName());
        existing.setAge(patient.getAge());
        existing.setDisease(patient.getDisease());
        existing.setDoctorName(patient.getDoctorName());

        return repository.save(existing);
    }

    @Override
    public void deletePatient(Long id) {
        repository.deleteById(id);
    }
}