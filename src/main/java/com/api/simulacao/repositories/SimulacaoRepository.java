package com.api.simulacao.repositories;

import com.api.simulacao.models.Simulacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SimulacaoRepository extends JpaRepository<Simulacao, UUID> {
}
