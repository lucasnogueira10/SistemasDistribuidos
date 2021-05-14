package br.com.controller;

import br.com.constant.Constant;
import br.com.Model.Modulo;
import br.com.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @PostMapping(Constant.API_MODULO)
    public void save(@RequestBody Modulo ambiente){
        moduloService.save(ambiente);
    }

    @GetMapping(Constant.API_MODULO)
    public List<Modulo> findAll(){
        return moduloService.findAll();
    }

    @PutMapping(Constant.API_MODULO)
    public void update (@RequestBody Modulo ambiente){
        moduloService.save(ambiente);
    }

    @DeleteMapping(Constant.API_MODULO + "/{id}")
    public void delete(@PathVariable("id") String id){
        moduloService.delete(id);
    }

    @GetMapping(Constant.API_MODULO + "/{id}")
    public Optional<Modulo> findById(@PathVariable("id") String id){
        return moduloService.findById(id);
    }
}
