package br.gov.teste.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import br.gov.teste.prova.entity.Lotacao;
import br.gov.teste.prova.repository.LotacaoRepository;

@Service
public class LotacaoService {

    @Autowired
    LotacaoRepository lotacaoRepository;


    public void populaLotacao(List<Lotacao> lotacaos) {

        for (Lotacao lotacao : lotacaos) {
            Lotacao newLotacao = lotacaoRepository.save(lotacao);
            System.out.println(newLotacao);
        }

    }

    public List<Lotacao> listaLotacao(Pageable pageable) {
        return lotacaoRepository.findAll();
    }
    public void getLotacaoMaiorSalario(){
        
    }
}
