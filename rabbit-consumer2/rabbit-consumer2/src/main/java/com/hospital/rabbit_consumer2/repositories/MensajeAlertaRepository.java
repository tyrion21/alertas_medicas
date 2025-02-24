package com.hospital.rabbit_consumer2.repositories;

import com.hospital.rabbit_consumer2.models.MensajeAlerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeAlertaRepository extends JpaRepository<MensajeAlerta, Long> {
}
