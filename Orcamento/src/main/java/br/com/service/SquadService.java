package br.com.service;

import br.com.Model.Squad;
import br.com.repository.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SquadService {

    @Autowired
    private SquadRepository squadRepository;

    public void save(Squad squad){
        squadRepository.save(squad);
    }

    public List<Squad> findAll (){
        return squadRepository.findAll();
    }

    public Optional<Squad> findById(String id){
        return squadRepository.findById(id);
    }

    public void delete(String id){
        squadRepository.deleteById(id);
    }
}
