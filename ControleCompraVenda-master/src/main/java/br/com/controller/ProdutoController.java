package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Produto;
import br.com.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(Constant.API_PRODUTO)
    public void save(@RequestBody Produto produto){
        produtoService.sendProdutoRabbit(produto);
    }

    @GetMapping(Constant.API_PRODUTO)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @PutMapping(Constant.API_PRODUTO)
    public void update (@RequestBody Produto produto){
        produtoService.save(produto);
    }

    @DeleteMapping(Constant.API_PRODUTO + "/{id}")
    public void delete(@PathVariable("id") String id){
        produtoService.delete(id);
    }

    @GetMapping(Constant.API_PRODUTO + "/{id}")
    public Optional<Produto> findById(@PathVariable("id") String id){
        return produtoService.findById(id);
    }
}