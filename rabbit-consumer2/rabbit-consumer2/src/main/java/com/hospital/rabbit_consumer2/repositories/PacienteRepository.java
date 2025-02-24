package com.hospital.rabbit_consumer2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.rabbit_consumer2.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    
} 
