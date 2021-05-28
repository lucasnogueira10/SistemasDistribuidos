package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Fornecedor;
import br.com.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping(Constant.API_FORNECEDOR)
    public void save(@RequestBody Fornecedor fornecedor){
        fornecedorService.sendFornecedorRabbit(fornecedor);
    }

    @GetMapping(Constant.API_FORNECEDOR)
    public List<Fornecedor> findAll(){
        return fornecedorService.findAll();
    }

    @PutMapping(Constant.API_FORNECEDOR)
    public void update (@RequestBody Fornecedor fornecedor){
        fornecedorService.save(fornecedor);
    }

    @DeleteMapping(Constant.API_FORNECEDOR + "/{id}")
    public void delete(@PathVariable("id") String id){
        fornecedorService.delete(id);
    }

    @GetMapping(Constant.API_FORNECEDOR + "/{id}")
    public Optional<Fornecedor> findById(@PathVariable("id") String id){
        return fornecedorService.findById(id);
    }
}
