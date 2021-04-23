package br.com.service;

import br.com.model.Lanche;
import br.com.repository.LancheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LancheService {

    @Autowired
    private LancheRepository lancheRepository;

    public void save(Lanche lanche){
        lancheRepository.save(lanche);
    }

    public List<Lanche> findAll (){
        return lancheRepository.findAll();
    }

    public Optional<Lanche> findById(String id){
        return lancheRepository.findById(id);
    }

    public void delete(String id){
        lancheRepository.deleteById(id);
    }
}
