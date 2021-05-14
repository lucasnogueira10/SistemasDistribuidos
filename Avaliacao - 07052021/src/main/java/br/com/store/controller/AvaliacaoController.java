package br.com.store.controller;

import br.com.store.model.Avaliacao;
import br.com.store.constant.Constant;
import br.com.store.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping(Constant.API_AVALIACAO)
    public void save(@RequestBody Avaliacao avaliacao){
        avaliacaoService.sendProductRabbit(avaliacao);
        //productService.save(client);
    }

    @GetMapping(Constant.API_AVALIACAO)
    public List<Avaliacao> findAll(){
        return avaliacaoService.findAll();
    }

    @PutMapping(Constant.API_AVALIACAO)
    public void update (@RequestBody Avaliacao avaliacao){
        avaliacaoService.save(avaliacao);
    }

    @DeleteMapping(Constant.API_AVALIACAO + "/{id}")
    public void delete(@PathVariable("id") String id){
        avaliacaoService.delete(id);
    }

    @GetMapping(Constant.API_AVALIACAO + "/{id}")
    public Optional<Avaliacao> findById(@PathVariable("id") String id){
        return avaliacaoService.findById(id);
    }
}
