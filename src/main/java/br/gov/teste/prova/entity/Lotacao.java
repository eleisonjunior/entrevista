package br.gov.teste.prova.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Lotacao {

    @Id
    private Integer id;


    private String nomeLotacao;

    @OneToMany
    private List<Funcionario> funcionarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeLotacao() {
        return nomeLotacao;
    }

    public void setNomeLotacao(String nomeLotacao) {
        this.nomeLotacao = nomeLotacao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Lotacao(Integer id, String nomeLotacao, List<Funcionario> funcionarios) {
        this.id = id;
        this.nomeLotacao = nomeLotacao;
        this.funcionarios = funcionarios;
    }

    public Lotacao() {
    }

    @Override
    public String toString() {
        return "Lotacao [id=" + id + ", nomeLotacao=" + nomeLotacao + ", funcionarios=" + funcionarios + "]";
    }

}
