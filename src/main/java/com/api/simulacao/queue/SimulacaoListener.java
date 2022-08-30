package com.api.simulacao.queue;

import com.api.simulacao.models.Simulacao;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SimulacaoListener {

    @RabbitListener(queues = {"${queue.simulacao.name}"})
    public void receive(@Payload Simulacao simulacao) {
        System.out.println("Valor de entrada: " + simulacao.getValorEntrada() + "\n" +
                            "Valor do financiamento: " + simulacao.getValorFinanciamento() + "\n" +
                            "Quantidade de parcelas: " + simulacao.getQuantidadeParcelas() + "\n" +
                            "Data da simulação: " + simulacao.getDataSimulacao() + "\n");
        System.out.println("Teste funcionou nessa porcaria");
    }
}
