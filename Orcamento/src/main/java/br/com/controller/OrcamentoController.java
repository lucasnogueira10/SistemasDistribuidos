package br.com.controller;

import br.com.constant.Constant;
import br.com.Model.Orcamento;
import br.com.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@RestController
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping(Constant.API_ORCAMENTO)
    public void save(@RequestBody Orcamento orcamento) throws ParseException {
        orcamento.setQtdDias(calcularQtdDias(orcamento.getDtInicio(), orcamento.getDtFim()));
        orcamentoService.save(orcamento);
    }

    @GetMapping(Constant.API_ORCAMENTO)
    public List<Orcamento> findAll(){
        return orcamentoService.findAll();
    }

    @PutMapping(Constant.API_ORCAMENTO)
    public void update (@RequestBody Orcamento orcamento){
        orcamentoService.save(orcamento);
    }

    @DeleteMapping(Constant.API_ORCAMENTO + "/{id}")
    public void delete(@PathVariable("id") String id){
        orcamentoService.delete(id);
    }

    @GetMapping(Constant.API_ORCAMENTO + "/{id}")
    public Optional<Orcamento> findById(@PathVariable("id") String id){
        return orcamentoService.findById(id);
    }

    public int calcularQtdDias(String inicio, String fim) throws ParseException {
        String dias;

        Date dataInicio = new SimpleDateFormat("dd/MM/yyyy").parse(inicio);
        Date dataFim = new SimpleDateFormat("dd/MM/yyyy").parse(fim);

        long diffInMillies = Math.abs(dataFim.getTime() - dataInicio.getTime());
        long diferenca = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return Integer.parseInt(String.valueOf(diferenca));
    }
}
