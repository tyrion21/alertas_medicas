package com.example.kafka_consumer.service;

import com.example.kafka_consumer.entity.SenalVital;
import com.example.kafka_consumer.repository.SenalVitalRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerService {

    private final SenalVitalRepository repository;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "senal_vital_topic", groupId = "${spring.kafka.consumer.group-id}")
    @Transactional
    public void consume(String message, Acknowledgment ack) {
        try {
            log.info("Consumer Started - Attempting to process message");
            log.info("Raw message received: {}", message);
            // ...existing code...
        } catch (Exception e) {
            log.error("Error in consumer: {}", e.getMessage(), e);
        }
    }
}