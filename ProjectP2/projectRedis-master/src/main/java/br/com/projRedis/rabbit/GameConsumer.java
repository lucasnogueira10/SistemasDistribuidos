package br.com.projRedis.rabbit;

import br.com.projRedis.model.Game;
import br.com.projRedis.service.GameService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class GameConsumer {

    @Autowired
    private GameService gameService;

    @RabbitListener(queues = {"gameQueue"})
    public void receive (@Payload Game game){
        System.out.println("Id: "+ game.get_id() + "\nNome: " + game.getName()
                + "\nDescrição: " + game.getDescription());
        gameService.save(game);
    }
}