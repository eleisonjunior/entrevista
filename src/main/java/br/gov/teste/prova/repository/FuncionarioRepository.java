package br.gov.teste.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.teste.prova.entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer >{
    
}
