package br.com.rabbit;

import br.com.model.Venda;
import br.com.service.VendaService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VendaConsumer {

    @Autowired
    private VendaService vendaService;

    @RabbitListener(queues = {"${queue.venda.name}"})
    public void receive (@Payload Venda venda){
        System.out.println("Id: "+ venda.get_id() + "\nDescricao: " + venda.getDescricao()
                + "\nData: " + venda.getData() + "\nProduto: " + venda.getProduto().getNome()
                + "\nCliente: " + venda.getCliente().getNome());
        vendaService.save(venda);
    }
}