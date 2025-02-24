package com.example.kafka_consumer.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "SENALES_VITALES")
@Data
public class SenalVital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "senal_vital_seq")
    @SequenceGenerator(name = "senal_vital_seq", sequenceName = "SENAL_VITAL_SEQ", allocationSize = 1)
    private Long id;
    private Double temperatura;
    private Integer presionSanguinea;
    private Integer frecuenciaCardiaca;
    @Column(name = "FECHA_REGISTRO")
    private LocalDateTime fechaRegistro;
}