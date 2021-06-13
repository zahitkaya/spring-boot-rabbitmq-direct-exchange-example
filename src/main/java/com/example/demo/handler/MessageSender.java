package com.example.demo.handler;

/*
* Bu class kuyruğa mesajı gönderir.
 */


import com.example.demo.model.Message;
import com.example.demo.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;

@Component
@RequiredArgsConstructor
public class MessageSender {

    final MessageProducer messageProducer;

    public void createAndSendMessage(){
        Message message=Message.builder()
                .message("Sample Message Text")
                .createdAt(Calendar.getInstance().getTime())
                .seen(true)
                .id(2021)
                .build();

        messageProducer.sendToQueue(message);
    }

    @PostConstruct
    public void init(){
        createAndSendMessage();
    }

}
