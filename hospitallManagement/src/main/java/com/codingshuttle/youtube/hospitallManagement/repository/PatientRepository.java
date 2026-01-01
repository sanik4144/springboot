package com.codingshuttle.youtube.hospitallManagement.repository;

import com.codingshuttle.youtube.hospitallManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long > {
}
