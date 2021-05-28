package br.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;

@SpringBootApplication
public class Main {

    @Value("${queue.controleCV.name}")
    private String controleCVQueue;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public Queue queue() {
        return new Queue(controleCVQueue, true);
    }
}
