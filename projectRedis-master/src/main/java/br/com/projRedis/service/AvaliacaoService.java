package br.com.projRedis.service;

import br.com.projRedis.model.Avaliacao;
import br.com.projRedis.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository personRepository;

    public List<Avaliacao> findAll(){
        return personRepository.findAll();
    }

    public void save(Avaliacao person){
        personRepository.save(person);
    }

    public Avaliacao findById(String id){
        return personRepository.findById(id).get();
    }
}
