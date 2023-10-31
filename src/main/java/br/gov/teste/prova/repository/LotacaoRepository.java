package br.gov.teste.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.teste.prova.entity.Lotacao;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao, Integer >{
    
}
