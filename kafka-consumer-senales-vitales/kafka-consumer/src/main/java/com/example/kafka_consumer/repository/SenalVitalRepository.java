package com.example.kafka_consumer.repository;

import com.example.kafka_consumer.entity.SenalVital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenalVitalRepository extends JpaRepository<SenalVital, Long> {
}