package com.api.simulacao.controllers;

import com.api.simulacao.dtos.SimulacaoDto;
import com.api.simulacao.mensagens.MensagemErro;
import com.api.simulacao.models.Simulacao;
import com.api.simulacao.services.SimulacaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/simulacao")
public class SimulacaoController {

    /**
     * Representa a injeção da classe service
     * dentro da controller
     */
    final SimulacaoService simulacaoService;
    final HashMap<String, Object> map;

    public SimulacaoController(SimulacaoService simulacaoService, HashMap<String, Object> map) {
        this.simulacaoService = simulacaoService;
        this.map = map;
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

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSimulacao(@PathVariable(value = "id") Integer id) {
        Optional<Simulacao> simulacaoOptional = simulacaoService.findById(id);
        if (!simulacaoOptional.isPresent()) {
            map.put("codigo", MensagemErro.NAO_ENCONTRADO.getCodigo());
            map.put("mensagem", MensagemErro.NAO_ENCONTRADO.getMensagem());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
        }
        return ResponseEntity.status(HttpStatus.OK).body(simulacaoOptional.get());
    }

    @GetMapping
    public ResponseEntity<Object> listaSimulacao() {
        return ResponseEntity.status(HttpStatus.OK).body(simulacaoService.listaSimulacao());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateSimulacao(@RequestBody @Valid SimulacaoDto simulacaoDto, @PathVariable(value = "id") Integer id) {
        Optional<Simulacao> simulacaoOptional = simulacaoService.findById(id);
        if (!simulacaoOptional.isPresent()) {
            map.put("codigo", MensagemErro.NAO_ENCONTRADO.getCodigo());
            map.put("mensagem", MensagemErro.NAO_ENCONTRADO.getMensagem());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
        }
        Simulacao simulacao = new Simulacao();
        BeanUtils.copyProperties(simulacaoDto, simulacao);
        simulacao.setId(simulacaoOptional.get().getId());
        simulacao.setDataSimulacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.OK).body(simulacaoService.save(simulacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaSimulacao(@PathVariable(value = "id") Integer id) {
        Optional<Simulacao> simulacaoOptional = simulacaoService.findById(id);
        if (!simulacaoOptional.isPresent()) {
            map.put("codigo", MensagemErro.NAO_ENCONTRADO.getCodigo());
            map.put("mensagem", MensagemErro.NAO_ENCONTRADO.getMensagem());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
        }
        simulacaoService.deletaSimulacao(simulacaoOptional.get());
        map.put("codigo", MensagemErro.DELETADO.getCodigo());
        map.put("mensagem", MensagemErro.DELETADO.getMensagem());
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
