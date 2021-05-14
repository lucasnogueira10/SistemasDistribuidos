package br.com.service;

import br.com.Model.Orcamento;
import br.com.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public void save(Orcamento orcamento){
        orcamentoRepository.save(orcamento);
    }

    public List<Orcamento> findAll (){
        return orcamentoRepository.findAll();
    }

    public Optional<Orcamento> findById(String id){
        return orcamentoRepository.findById(id);
    }

    public void delete(String id){
        orcamentoRepository.deleteById(id);
    }
}