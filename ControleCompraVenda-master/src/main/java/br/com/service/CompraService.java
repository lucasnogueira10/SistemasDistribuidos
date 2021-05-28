package br.com.service;

import br.com.model.Compra;
import br.com.rabbit.CompraProducer;
import br.com.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private CompraProducer compraProducer;

    public void sendCompraRabbit(Compra compra){
        compraProducer.send(compra);
    }

    public void save(Compra compra){
        compraRepository.save(compra);
    }

    public List<Compra> findAll (){
        return compraRepository.findAll();
    }

    public Optional<Compra> findById(String id){
        return compraRepository.findById(id);
    }

    public void delete(String id){
        compraRepository.deleteById(id);
    }

    public void deleteAll(){
        compraRepository.deleteAll();
    }
}