package br.com.controller;

import br.com.constant.Constant;
import br.com.Model.Ambiente;
import br.com.service.AmbienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AmbienteController {

    @Autowired
    private AmbienteService ambienteService;

    @PostMapping(Constant.API_AMBIENTE)
    public void save(@RequestBody Ambiente ambiente){
        ambienteService.save(ambiente);
    }

    @GetMapping(Constant.API_AMBIENTE)
    public List<Ambiente> findAll(){
        return ambienteService.findAll();
    }

    @PutMapping(Constant.API_AMBIENTE)
    public void update (@RequestBody Ambiente ambiente){
        ambienteService.save(ambiente);
    }

    @DeleteMapping(Constant.API_AMBIENTE + "/{id}")
    public void delete(@PathVariable("id") String id){
        ambienteService.delete(id);
    }

    @GetMapping(Constant.API_AMBIENTE + "/{id}")
    public Optional<Ambiente> findById(@PathVariable("id") String id){
        return ambienteService.findById(id);
    }
}
