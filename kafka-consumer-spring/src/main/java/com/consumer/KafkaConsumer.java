package com.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "quickstart-events", groupId = "group_id")
    public void consume(String message) {
        System.err.println("Message : " + message);
    }


}
