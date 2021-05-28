package br.com.rabbit;

import br.com.model.Venda;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendaProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Venda venda){
        rabbitTemplate.convertAndSend(this.queue.getName(), venda);
    }
}