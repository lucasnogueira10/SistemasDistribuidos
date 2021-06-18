package br.com.projRedis.service;

import br.com.projRedis.model.Game;
import br.com.projRedis.rabbit.GameProducer;
import br.com.projRedis.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private GameProducer gameProducer;

    public void sendGameRabbit(Game game){
       gameProducer.send(game);
    }


    public List<Game> findAll(){
        return gameRepository.findAll();
    }

    public void save(Game game){
        gameRepository.save(game);
    }

    public void delete(String id){
        gameRepository.deleteById(id);
    }

    public Optional<Game> findById(String id){
        return gameRepository.findById(id);
    }


    public void deleteAll(){
        gameRepository.deleteAll();
    }
}
