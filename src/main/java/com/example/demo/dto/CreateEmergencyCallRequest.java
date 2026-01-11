package com.example.demo.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmergencyCallRequest {
    @NotBlank(message = "Call ID is required")
    private String callId;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Phone is required")
    private String phone;

    @NotEmpty(message = "At least one patient is required")
    @Valid
    private List<PatientDTO> patients;

    @NotNull(message = "Medical assessment is required")
    @Valid
    private MedicalAssessmentDTO medicalAssessment;
}
