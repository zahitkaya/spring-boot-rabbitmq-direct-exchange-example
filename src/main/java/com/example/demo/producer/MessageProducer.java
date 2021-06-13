package com.example.demo.producer;

import com.example.demo.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageProducer {

    @Value("${rabbit.routing.name}")
    private String routingName;

    @Value("${rabbit.exchange.name}")
    private String exchangeName;

    final RabbitTemplate rabbitTemplate;

    public void sendToQueue(Message message){
        rabbitTemplate.convertAndSend(exchangeName,routingName,message);
        log.info("Message sent to queue: "+message);
    }

}
