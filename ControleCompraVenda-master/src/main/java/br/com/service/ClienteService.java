package br.com.service;

import br.com.model.Cliente;
import br.com.rabbit.ClienteProducer;
import br.com.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteProducer clienteProducer;

    public void sendClienteRabbit(Cliente cliente){
        clienteProducer.send(cliente);
    }

    public void save(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll (){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(String id){
        return clienteRepository.findById(id);
    }

    public void delete(String id){
        clienteRepository.deleteById(id);
    }

    public void deleteAll(){
        clienteRepository.deleteAll();
    }
}
