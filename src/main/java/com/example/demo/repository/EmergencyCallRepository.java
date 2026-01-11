package com.example.demo.repository;

import com.example.demo.model.EmergencyCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmergencyCallRepository extends JpaRepository<EmergencyCall,Long> {
    Optional<EmergencyCall> findByCallId(String callId);
    List<EmergencyCall> findByStatus(String status);
    List<EmergencyCall> findByPriorityLevel(String priorityLevel);
    List<EmergencyCall> findByPriorityLevelOrderByPriorityScoreDesc(String priorityLevel);




}
