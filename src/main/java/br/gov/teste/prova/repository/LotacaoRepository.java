package br.gov.teste.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.teste.prova.entity.Lotacao;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao, Integer> {

    @Query(value = "WITH LotacaoSalario AS (" +
            "    SELECT F.LOTACAO_ID, SUM(F.SALARIO) AS SALARIO_TOTAL " +
            "    FROM FUNCIONARIO F " +
            "    GROUP BY F.LOTACAO_ID" +
            ")" +
            ", MaiorSalarioPorLotacao AS (" +
            "    SELECT LS.LOTACAO_ID, LS.SALARIO_TOTAL, MAX(F.SALARIO) AS SALARIO_DO_MAIOR_FUNCIONARIO " +
            "    FROM LotacaoSalario LS " +
            "    JOIN FUNCIONARIO F ON LS.LOTACAO_ID = F.LOTACAO_ID " +
            "    GROUP BY LS.LOTACAO_ID, LS.SALARIO_TOTAL" +
            ")" +
            "SELECT new com.example.LotacaoInfo(LS.LOTACAO_ID, LS.SALARIO_TOTAL, MAX(F.SALARIO)) " +
            "FROM MaiorSalarioPorLotacao LS " +
            "ORDER BY SALARIO_TOTAL DESC " +
            "LIMIT 1", nativeQuery = true)
    Object findLotacaoComMaiorSalarioTotal();

}
