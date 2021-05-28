package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Venda;
import br.com.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping(Constant.API_VENDA)
    public void save(@RequestBody Venda venda){
        vendaService.sendVendaRabbit(venda);
    }

    @GetMapping(Constant.API_VENDA)
    public List<Venda> findAll(){
        return vendaService.findAll();
    }

    @PutMapping(Constant.API_VENDA)
    public void update (@RequestBody Venda venda){
        vendaService.save(venda);
    }

    @DeleteMapping(Constant.API_VENDA + "/{id}")
    public void delete(@PathVariable("id") String id){
        vendaService.delete(id);
    }

    @GetMapping(Constant.API_VENDA + "/{id}")
    public Optional<Venda> findById(@PathVariable("id") String id){
        return vendaService.findById(id);
    }
}
