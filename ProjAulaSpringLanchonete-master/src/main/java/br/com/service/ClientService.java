package br.com.service;

import br.com.model.Client;
import br.com.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void save(Client client){
        clientRepository.save(client);
    }

    public List<Client> findAll (){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(String id){
        return clientRepository.findById(id);
    }

    public void delete(String id){
        clientRepository.deleteById(id);
    }
}
