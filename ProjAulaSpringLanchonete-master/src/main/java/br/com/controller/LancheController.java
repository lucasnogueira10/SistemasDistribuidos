package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Lanche;
import br.com.service.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LancheController {

    @Autowired
    private LancheService lancheService;

    @PostMapping(Constant.API_LANCHE)
    public void save(@RequestBody Lanche lanche){
        lancheService.save(lanche);
    }

    @GetMapping(Constant.API_LANCHE)
    public List<Lanche> findAll(){
        return lancheService.findAll();
    }

    @PutMapping(Constant.API_LANCHE)
    public void update (@RequestBody Lanche lanche){
        lancheService.save(lanche);
    }

    @DeleteMapping(Constant.API_LANCHE + "/{id}")
    public void delete(@PathVariable("id") String id){
        lancheService.delete(id);
    }

    @GetMapping(Constant.API_LANCHE + "/{id}")
    public Optional<Lanche> findById(@PathVariable("id") String id){
        return lancheService.findById(id);
    }
}
