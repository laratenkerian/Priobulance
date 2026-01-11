package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    //This creates a unique identifier for each row in database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false )//this means every patient has to be full ( not empty)
    private String firstName;
    @Column(nullable = false )
    private String lastName;
    @Column(nullable = false )
    private long patientId;
    @Column(nullable = false )
    private int age;
    @Column(nullable = false )
    private boolean pregnancyFlag;

    @ManyToOne// emergency call has multiple patients
    @JoinColumn(name = "emergency_call_id", nullable = false)
    private EmergencyCall emergencyCall;


}
