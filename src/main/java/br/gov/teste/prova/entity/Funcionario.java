package br.gov.teste.prova.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcionario {

    @Id
    private Integer id;
    private String nome;
    private Float salario;
    
    @ManyToOne
    @JoinColumn(name = "lotacao_id")
    private Lotacao lotacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

    public Funcionario(Integer id, String nome, Float salario, Lotacao lotacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.lotacao = lotacao;
    }
}
    