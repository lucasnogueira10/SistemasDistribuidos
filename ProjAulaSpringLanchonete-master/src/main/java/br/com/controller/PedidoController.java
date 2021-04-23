package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Pedido;
import br.com.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping(Constant.API_PEDIDO)
    public void save(@RequestBody Pedido client){
        pedidoService.save(client);
    }

    @GetMapping(Constant.API_PEDIDO)
    public List<Pedido> findAll(){
        return pedidoService.findAll();
    }

    @PutMapping(Constant.API_PEDIDO)
    public void update (@RequestBody Pedido pedido){
        pedidoService.save(pedido);
    }

    @DeleteMapping(Constant.API_PEDIDO + "/{id}")
    public void delete(@PathVariable("id") String id){
        pedidoService.delete(id);
    }

    @GetMapping(Constant.API_PEDIDO + "/{id}")
    public Optional<Pedido> findById(@PathVariable("id") String id){
        return pedidoService.findById(id);
    }
}
