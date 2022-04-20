package com.api.simulacao.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class SimulacaoDto {

    @NotBlank
    private String valorEntrada;

    @NotBlank
    private String valorFinanciamento;

    @NotBlank
    private String quantidadeParcelas;

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
}
