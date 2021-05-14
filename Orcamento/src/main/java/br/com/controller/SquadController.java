package br.com.controller;

import br.com.constant.Constant;
import br.com.Model.Squad;
import br.com.service.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SquadController {

    @Autowired
    private SquadService squadService;

    @PostMapping(Constant.API_SQUAD)
    public void save(@RequestBody Squad ambiente){
        squadService.save(ambiente);
    }

    @GetMapping(Constant.API_SQUAD)
    public List<Squad> findAll(){
        return squadService.findAll();
    }

    @PutMapping(Constant.API_SQUAD)
    public void update (@RequestBody Squad ambiente){
        squadService.save(ambiente);
    }

    @DeleteMapping(Constant.API_SQUAD + "/{id}")
    public void delete(@PathVariable("id") String id){
        squadService.delete(id);
    }

    @GetMapping(Constant.API_SQUAD + "/{id}")
    public Optional<Squad> findById(@PathVariable("id") String id){
        return squadService.findById(id);
    }
}
