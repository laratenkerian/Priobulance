package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="medical_assesments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalAssessment {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;
    @Column
    private String consciousnessLevel;
    @Column
    private String breathingStatus;
    @Column
    private String bleedingStatus;
    @Column
    private String shockStatus;
    @Column
    private boolean strokeFlag;
    @Column
    private boolean chestPainFlag;
    @Column
    private boolean seizureFlag;
    @Column
    private boolean feverFlag;
    @Column
    private boolean traumaStatus;
    @Column
    private boolean abdominalPainFlag;
    @Column
    private String otherSymptoms;


}
