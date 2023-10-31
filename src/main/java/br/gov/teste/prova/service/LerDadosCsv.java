package br.gov.teste.prova.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.teste.prova.entity.Funcionario;
import br.gov.teste.prova.entity.Lotacao;
import br.gov.teste.prova.repository.FuncionarioRepository;
import br.gov.teste.prova.repository.LotacaoRepository;
import jakarta.annotation.PostConstruct;

@Service
public class LerDadosCsv {

    @Autowired
    private LotacaoRepository lotacaoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    private String pathLotacao = "src/main/java/br/gov/teste/prova/service/lotacao.csv";

    private String pathFuncionario = "src/main/java/br/gov/teste/prova/service/funcionario.csv";

    // metodo que pega dados do arquivo lotacao.csv e insere no banco
    public List<Lotacao> lerLotacao(String pathLotacao) throws IOException {
        List<Lotacao> newLotacaoList = new ArrayList<>();
        try (CSVParser parser = CSVParser.parse(new FileReader(pathLotacao), CSVFormat.DEFAULT)) {
            for (CSVRecord record : parser) {
                int id = Integer.valueOf(record.get(0));
                String nomeLotacao = record.get(1);
                
                Lotacao newLotacao = new Lotacao();

                newLotacao.setId(id);
                newLotacao.setNomeLotacao(nomeLotacao);

                newLotacaoList.add(newLotacao);
            }
        }

        return newLotacaoList;
    }

    // metodo que pega dados do arquivo funcionario.csv e insere no banco.
    public List<Funcionario> lerFuncionario(String pathFuncionario) throws IOException {

        List<Funcionario> newFuncionarioList = new ArrayList<>();

        try (CSVParser parser = CSVParser.parse(new FileReader(pathFuncionario), CSVFormat.DEFAULT)) {
            for (CSVRecord record : parser) {

                int id = Integer.valueOf(record.get(0));
                String nome = record.get(1);
                Integer salario = Integer.valueOf(record.get(2));
                Integer lotacaoId = Integer.valueOf(record.get(3));

                Funcionario newFuncionario = new Funcionario();
                Lotacao lotacao = lotacaoRepository.getById(lotacaoId);

                newFuncionario.setId(id);
                newFuncionario.setNome(nome);
                newFuncionario.setSalario(salario);
                newFuncionario.setLotacao(lotacao);

                newFuncionarioList.add(newFuncionario);
            }
        }

        return newFuncionarioList;

    }

    public void insereLotacao() {
        try {
            List<Lotacao> lotacaos = lerLotacao(pathLotacao);
            for (Lotacao lotacao : lotacaos) {
                lotacaoRepository.save(lotacao);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insereFuncionario() {
        try {
            List<Funcionario> funcionarios = lerFuncionario(pathFuncionario);
            for (Funcionario funcionario : funcionarios) {
                funcionarioRepository.save(funcionario);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }
}
