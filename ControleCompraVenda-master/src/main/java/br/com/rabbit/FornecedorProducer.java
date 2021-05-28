package br.com.rabbit;

import br.com.model.Fornecedor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FornecedorProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Fornecedor fornecedor){
        rabbitTemplate.convertAndSend(this.queue.getName(), fornecedor);
    }
}