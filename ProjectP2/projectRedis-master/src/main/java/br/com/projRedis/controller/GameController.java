package br.com.projRedis.controller;

import br.com.projRedis.Constant.Constant;
import br.com.projRedis.model.Game;
import br.com.projRedis.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping(Constant.API_GAME)
    public void save(@RequestBody Game game) {
        gameService.sendGameRabbit(game);
        //productService.save(client);
    }

    @GetMapping(Constant.API_GAME)
    public List<Game> findAll() {
        return gameService.findAll();
    }

    @PutMapping(Constant.API_GAME)
    public void update(@RequestBody Game game) {
        gameService.save(game);
    }

    @DeleteMapping(Constant.API_GAME + "/{id}")
    public void delete(@PathVariable("id") String id) {
        gameService.delete(id);
    }

    @GetMapping(Constant.API_GAME + "/{id}")
    public Optional<Game> findById(@PathVariable("id") String id) {
        return gameService.findById(id);
    }
}
