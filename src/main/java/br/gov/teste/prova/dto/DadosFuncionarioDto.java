package br.gov.teste.prova.dto;

public class DadosFuncionarioDto {

    private Integer id;
    private String nome;
    private String salario;
    private String idLotacao;
    
    private DadosFuncionarioDto(){

    }

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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getIdLotacao() {
        return idLotacao;
    }

    public void setIdLotacao(String idLotacao) {
        this.idLotacao = idLotacao;
    }

    public DadosFuncionarioDto(Integer id, String nome, String salario, String idLotacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idLotacao = idLotacao;
    }


    
}
