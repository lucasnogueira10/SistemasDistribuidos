package br.com.projRedis.rabbit;

import br.com.projRedis.model.Game;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Game game){
        rabbitTemplate.convertAndSend(this.queue.getName(), game);
    }
}