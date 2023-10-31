package br.gov.teste.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.teste.prova.service.FuncionarioService;
import br.gov.teste.prova.service.LerDadosCsv;
import br.gov.teste.prova.service.LotacaoService;

@RestController
@RequestMapping("/lotacao")
public class LotacaoController {

    @Autowired
    LotacaoService lotacaoService;

    @Autowired
    LerDadosCsv lerDadosCsv;

    @PostMapping("/populaBase")
    public void populaAmbasBases() {
        try {
            System.out.println("chamando metodos popula base");
            lerDadosCsv.insereLotacao();
            lerDadosCsv.insereFuncionario();
        } catch (Exception e) {
            // TODO: handle exception

        }

    }

    @GetMapping("/getAll")
    public ResponseEntity<?> listaLotacaoMaiorSalario() {
        System.out.println("chamando listar salario maior lotacação");
        return null;
    }
}
