package com.lucasgabriel.springbootwithkafka.controllers;

import com.lucasgabriel.springbootwithkafka.services.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}
