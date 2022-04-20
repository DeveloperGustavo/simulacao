package com.api.simulacao.services;

import com.api.simulacao.models.Simulacao;
import com.api.simulacao.repositories.SimulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SimulacaoService {

    /**
     * A anotação Autowired diz que em determinados momentos
     * precisará utilizar a dependência de simulacaoRepository
     * dentro deste service.
     */
//    @Autowired
//    SimulacaoRepository simulacaoRepository;

    final SimulacaoRepository simulacaoRepository;

    public SimulacaoService(SimulacaoRepository simulacaoRepository) {
        this.simulacaoRepository = simulacaoRepository;
    }

    /**
     * A anotação @Transaction indica que este método realiza uma transação no banco de dados
     * isso impede que caso tenhamos algum erro, seja feito um rollback, por exemplo.
     * No fim, só indica que é um método de uma operação transacional no banco de dados.
     *
     * @param simulacao
     * @return
     */
    @Transactional
    public Simulacao save(Simulacao simulacao) {
        return simulacaoRepository.save(simulacao);
    }
}
