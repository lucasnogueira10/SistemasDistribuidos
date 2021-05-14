package br.com.store.service;

import br.com.store.model.Avaliacao;
import br.com.store.rabbit.AvaliacaoProducer;
import br.com.store.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private AvaliacaoProducer avaliacaoProducer;

    public void sendProductRabbit(Avaliacao avaliacao){
        avaliacaoProducer.send(avaliacao);
    }

    public  void save(Avaliacao avaliacao){
        avaliacaoRepository.save(avaliacao);
    }

    public List<Avaliacao> findAll (){
        return avaliacaoRepository.findAll();
    }

    public Optional<Avaliacao> findById(String id){
        return avaliacaoRepository.findById(id);
    }

    public void delete(String id){
        avaliacaoRepository.deleteById(id);
    }

    public void deleteAll(){
        avaliacaoRepository.deleteAll();
    }
}
