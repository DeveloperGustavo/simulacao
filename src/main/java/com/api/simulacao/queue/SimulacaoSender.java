package com.api.simulacao.queue;

import com.api.simulacao.models.Simulacao;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimulacaoSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue simulacaoQueue;

    public void send(Simulacao simulacao) {
        this.rabbitTemplate.convertAndSend(this.simulacaoQueue.getName(), simulacao);
    }
}
