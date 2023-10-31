package br.gov.teste.prova.dto;

public class DadosLotacaoDto {

    private Integer id;
    private String nomeLotacao;

    public DadosLotacaoDto(){
        
    }

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

    public DadosLotacaoDto(Integer id, String nomeLotacao) {
        this.id = id;
        this.nomeLotacao = nomeLotacao;
    }
    
}
