package com.example.demo.repository;

import com.example.demo.model.MedicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MedicalAssessmentRepository extends JpaRepository<MedicalAssessment, Long> {
    Optional<MedicalAssessment> findByEmergencyCallId(Long emergencyCallId);
}
