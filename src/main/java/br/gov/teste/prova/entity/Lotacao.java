package br.gov.teste.prova.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Lotacao {

    @Id
    private Integer id;

    @OneToMany
    private List<Funcionario> funcionarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Lotacao(Integer id, List<Funcionario> funcionarios) {
        this.id = id;
        this.funcionarios = funcionarios;
    }

    

    
}
