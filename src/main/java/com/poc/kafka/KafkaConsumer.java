package com.poc.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "topico1")
    public void listener(String mensagem){
        System.out.println(mensagem);
    }
}
