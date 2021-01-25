package com.lucasgabriel.springbootwithkafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private static final String TOPIC = "users";
    private static final String GROUP_ID = "group_id";

    @KafkaListener(topics = TOPIC, groupId = GROUP_ID)
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed Message -> %s", message));
    }
}
