package com.api.simulacao.controllers;

import com.api.simulacao.dtos.SimulacaoDto;
import com.api.simulacao.models.Simulacao;
import com.api.simulacao.services.SimulacaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/simulacao")
public class SimulacaoController {

    /**
     * Representa a injeção da classe service
     * dentro da controller
     */
    final SimulacaoService simulacaoService;

    public SimulacaoController(SimulacaoService simulacaoService) {
        this.simulacaoService = simulacaoService;
    }

    /**
     * A anotação @RequestBody indica que vamos receber um JSON na requisitação
     * A anoaçao @Valid indica que precisamos validar o body na calsse DTO
     *
     * @param simulacao
     * @return
     */
    @PostMapping
    public ResponseEntity<Object> salvaSimulacao(@RequestBody @Valid SimulacaoDto simulacaoDto) {
        Simulacao simulacao = new Simulacao();

        // Convertendo o Dto em Model
        BeanUtils.copyProperties(simulacaoDto, simulacao);

        simulacao.setDataSimulacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(simulacaoService.save(simulacao));
    }
}
