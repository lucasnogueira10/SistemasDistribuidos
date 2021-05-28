package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Compra;
import br.com.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping(Constant.API_COMPRA)
    public void save(@RequestBody Compra compra){
        compraService.sendCompraRabbit(compra);
    }

    @GetMapping(Constant.API_COMPRA)
    public List<Compra> findAll(){
        return compraService.findAll();
    }

    @PutMapping(Constant.API_COMPRA)
    public void update (@RequestBody Compra compra){
        compraService.save(compra);
    }

    @DeleteMapping(Constant.API_COMPRA + "/{id}")
    public void delete(@PathVariable("id") String id){
        compraService.delete(id);
    }

    @GetMapping(Constant.API_COMPRA + "/{id}")
    public Optional<Compra> findById(@PathVariable("id") String id){
        return compraService.findById(id);
    }
}
