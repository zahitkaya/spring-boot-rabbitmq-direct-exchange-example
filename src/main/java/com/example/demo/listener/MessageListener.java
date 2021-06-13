package com.example.demo.listener;

import com.example.demo.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageListener {

    @RabbitListener(queues = "message-queue")
    public void listenMessage(Message message){
        log.info("Message listened: "+message);
    }
}
