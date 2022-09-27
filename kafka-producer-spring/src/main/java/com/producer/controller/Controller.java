package com.producer.controller;

import com.producer.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    KafkaTemplate<String, Book> kafkaTemplate;

    private static final String TOPIC = "quickstart-events";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Book book)
    {
        kafkaTemplate.send(TOPIC, book);
        return "Published Successfully!";
    }

}
