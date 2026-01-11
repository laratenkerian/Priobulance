package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MedicalAssessmentDTO {

    private Long id;
    private String consciousnessLevel;
    private String breathingStatus;
    private String bleedingStatus;
    private String shockStatus;
    private boolean strokeFlag;
    private boolean chestPainFlag;
    private boolean seizureFlag;
    private boolean feverFlag;
    private boolean traumaStatus;
    private boolean abdominalPainFlag;
    private String otherSymptoms;

}
