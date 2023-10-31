package br.gov.teste.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.gov.teste.prova.entity.Lotacao;
import br.gov.teste.prova.repository.LotacaoRepository;

@Service
public class LotacaoService {

    @Autowired
    private LotacaoRepository lotacaoRepository;

    private void populaLotacao(List<Lotacao> lotacaos) {

        for (Lotacao lotacao : lotacaos) {
            Lotacao newFuncionario = lotacaoRepository.save(lotacao);

        }

    }

    private List<Lotacao> listaFuncionarios(Pageable pageable) {
        return lotacaoRepository.findAll();
    }

}
