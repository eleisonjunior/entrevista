package br.gov.teste.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.teste.prova.entity.Funcionario;
import br.gov.teste.prova.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;



    @GetMapping("/getAll")
    public ResponseEntity<?> listaFuncionarios() {
        
        List<Funcionario> listFuncionario = funcionarioService.listaFuncionarios();
        return ResponseEntity.ok().body(listFuncionario);
    }

}
