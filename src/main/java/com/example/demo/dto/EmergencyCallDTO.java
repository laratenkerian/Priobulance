package com.example.demo.dto;

import com.example.demo.model.Patient;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyCallDTO {
    private Long id;
    private String callId;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp createTime;
    private String address;
    private String phone;
    private int priorityScore;
    private String priorityLevel;
    private String status;
    private List<PatientDTO> patients;
    private MedicalAssessmentDTO medicalAssessment;
}
