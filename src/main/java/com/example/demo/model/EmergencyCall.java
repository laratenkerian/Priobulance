package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="emergency_calls")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyCall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String callId;
    @Column(nullable = false)
    private Timestamp startTime;
    @Column(nullable = false)
    private Timestamp endTime;
    @Column(nullable = false)
    private Timestamp createTime;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private int priorityScore;
    @Column(nullable = false)
    private String priorityLevel;
    @Column(nullable = false)
    private String Status;
}
