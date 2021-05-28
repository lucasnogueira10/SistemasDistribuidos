package br.com.rabbit;

import br.com.model.Cliente;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Cliente cliente){
        rabbitTemplate.convertAndSend(this.queue.getName(), cliente);
    }
}