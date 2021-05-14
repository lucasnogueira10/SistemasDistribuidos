package br.com.service;

import br.com.Model.Modulo;
import br.com.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloService {

    @Autowired
    private ModuloRepository moduloRepository;

    public void save(Modulo modulo){
        moduloRepository.save(modulo);
    }

    public List<Modulo> findAll (){
        return moduloRepository.findAll();
    }

    public Optional<Modulo> findById(String id){
        return moduloRepository.findById(id);
    }

    public void delete(String id){
        moduloRepository.deleteById(id);
    }
}
