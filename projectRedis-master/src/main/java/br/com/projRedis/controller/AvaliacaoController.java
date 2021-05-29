package br.com.projRedis.controller;

import br.com.projRedis.model.Avaliacao;
import br.com.projRedis.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping("/api/avaliacao")
    public List<Avaliacao> findAll(){
        return avaliacaoService.findAll();
    }

    @PostMapping("/api/avaliacao")
    public void save(Avaliacao avaliacao){
        avaliacaoService.save(avaliacao);
    }

    @GetMapping("/api/avaliacao/{id}")
    @Cacheable("avaliacao")
    public Avaliacao findById(@PathVariable("id") String id){
        System.out.println("Find Information.. " + id);
        return avaliacaoService.findById(id);
    }
}
