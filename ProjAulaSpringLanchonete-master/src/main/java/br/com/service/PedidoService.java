package br.com.service;

import br.com.model.Pedido;
import br.com.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void save(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public List<Pedido> findAll (){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> findById(String id){
        return pedidoRepository.findById(id);
    }

    public void delete(String id){
        pedidoRepository.deleteById(id);
    }
}
