package com.hospital.rabbit_consumer2;

import com.hospital.rabbit_consumer2.models.Paciente;
import com.hospital.rabbit_consumer2.models.SenalesVitales;
import com.hospital.rabbit_consumer2.models.MensajeAlerta;
import com.hospital.rabbit_consumer2.repositories.PacienteRepository;
import com.hospital.rabbit_consumer2.repositories.SenalesVitalesRepository;
import com.hospital.rabbit_consumer2.repositories.MensajeAlertaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListener {

    private final PacienteRepository pacienteRepository;
    private final SenalesVitalesRepository senalesVitalesRepository;
    private final MensajeAlertaRepository mensajeAlertaRepository;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_PACIENTE)
    public void readPaciente(Paciente paciente) {
        log.info("Paciente recibido: {}", paciente);

        // Guardar en la base de datos
        pacienteRepository.save(paciente);
        log.info("Paciente guardado en la base de datos");
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_SENALES_VITALES)
    public void readSenalesVitales(SenalesVitales senalesVitales) {
        log.info("Señales vitales recibidas: {}", senalesVitales);

        // Guardar en la base de datos
        senalesVitalesRepository.save(senalesVitales);
        log.info("Señales vitales guardadas en la base de datos");
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_MENSAJE_ALERTA)
    public void readMensajeAlerta(MensajeAlerta mensajeAlerta) {
        log.info("Mensaje de alerta recibido: {}", mensajeAlerta);

        // Guardar en la base de datos
        mensajeAlertaRepository.save(mensajeAlerta);
        log.info("Mensaje de alerta guardado en la base de datos");
    }
}
