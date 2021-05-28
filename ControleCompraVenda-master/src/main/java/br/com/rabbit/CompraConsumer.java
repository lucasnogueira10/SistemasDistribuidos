package br.com.rabbit;

import br.com.model.Compra;
import br.com.service.CompraService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CompraConsumer {

    @Autowired
    private CompraService compraService;

    @RabbitListener(queues = {"${queue.compra.name}"})
    public void receive (@Payload Compra compra){
        System.out.println("Id: "+ compra.get_id() + "\nDescricao: " + compra.getDescricao()
                + "\nProduto: " + compra.getProduto().getNome() + "\nFornecedor: " + compra.getFornecedor().getNome());
        compraService.save(compra);
    }
}