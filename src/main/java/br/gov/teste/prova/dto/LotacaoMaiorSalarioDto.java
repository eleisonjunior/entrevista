package br.gov.teste.prova.dto;

public class LotacaoMaiorSalarioDto {

    private Integer idLotacao;
    private Integer salarioTotal;
    private Integer maiorSalario;

    public LotacaoMaiorSalarioDto() {

    }

    public Integer getIdLotacao() {
        return idLotacao;
    }

    public void setIdLotacao(Integer idLotacao) {
        this.idLotacao = idLotacao;
    }

    public Integer getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Integer salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public Integer getMaiorSalario() {
        return maiorSalario;
    }

    public void setMaiorSalario(Integer maiorSalario) {
        this.maiorSalario = maiorSalario;
    }

    public LotacaoMaiorSalarioDto(Integer idLotacao, Integer salarioTotal, Integer maiorSalario) {
        this.idLotacao = idLotacao;
        this.salarioTotal = salarioTotal;
        this.maiorSalario = maiorSalario;
    }

}
