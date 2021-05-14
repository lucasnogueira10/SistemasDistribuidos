package br.com.service;

import br.com.Model.Ambiente;
import br.com.repository.AmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmbienteService {

    @Autowired
    private AmbienteRepository ambienteRepository;

    public void save(Ambiente ambiente){
        ambienteRepository.save(ambiente);
    }

    public List<Ambiente> findAll (){
        return ambienteRepository.findAll();
    }

    public Optional<Ambiente> findById(String id){
        return ambienteRepository.findById(id);
    }

    public void delete(String id){
        ambienteRepository.deleteById(id);
    }
}
