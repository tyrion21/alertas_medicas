package com.hospital.rabbit_consumer2.repositories;

import com.hospital.rabbit_consumer2.models.SenalesVitales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenalesVitalesRepository extends JpaRepository<SenalesVitales, Long> {
}
