package br.gov.teste.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import br.gov.teste.prova.entity.Funcionario;
import br.gov.teste.prova.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public void populaFuncionario(List<Funcionario> funcionarios) {

        for (Funcionario funcionario : funcionarios) {
            Funcionario newFuncionario = funcionarioRepository.save(funcionario);
            System.out.println(newFuncionario);

        }

    }

    public List<Funcionario> listaFuncionarios() {
        return funcionarioRepository.findAll();
    }

}
