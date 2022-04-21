package com.api.simulacao.mensagens;

public enum MensagemErro {

    NAO_ENCONTRADO(1, "Simulação não encontrada."),
    DELETADO(2, "Simulação deletada com sucesso.");

    private Integer codigo;
    private String mensagem;

    private MensagemErro(Integer codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
