package br.com.rabbit;

import br.com.model.Produto;
import br.com.service.ProdutoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProdutoConsumer {

    @Autowired
    private ProdutoService produtoService;

    @RabbitListener(queues = {"${queue.produto.name}"})
    public void receive (@Payload Produto produto){
        System.out.println("Id: "+ produto.get_id() + "\nNome: " + produto.getNome());
        produtoService.save(produto);
    }
}
