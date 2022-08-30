package com.api.simulacao.mock;

import com.api.simulacao.dtos.SimulacaoDto;
import com.api.simulacao.models.Simulacao;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class SimulacaoMock {

    @Autowired
    private SimulacaoDto simulacaoDto;

    public SimulacaoDto getSimulacao() {
        simulacaoDto.setValorEntrada("1000");
        simulacaoDto.setQuantidadeParcelas("50");
        simulacaoDto.setValorFinanciamento("50000");
        return new SimulacaoDto();
    }
}
