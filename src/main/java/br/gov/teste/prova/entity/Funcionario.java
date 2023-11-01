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

    private Integer salario;

    @ManyToOne
    @JoinColumn(name = "lotacaoId")
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

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

    public Funcionario(Integer id, String nome, Integer salario, Lotacao lotacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.lotacao = lotacao;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", lotacao=" + lotacao + "]";
    }
}
