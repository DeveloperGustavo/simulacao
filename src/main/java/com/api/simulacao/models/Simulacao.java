package com.api.simulacao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SIMULACOES")
public class Simulacao implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String valorEntrada;

    @Column(nullable = false)
    private String valorFinanciamento;

    @Column(nullable = false)
    private String quantidadeParcelas;

    private Double taxaJuros = 5.0;

    @Column(nullable = false)
    private LocalDateTime dataSimulacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(String valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(String valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }

    public String getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(String quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public LocalDateTime getDataSimulacao() {
        return dataSimulacao;
    }

    public void setDataSimulacao(LocalDateTime dataSimulacao) {
        this.dataSimulacao = dataSimulacao;
    }
}
