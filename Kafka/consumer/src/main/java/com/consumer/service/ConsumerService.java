package com.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerService {

    @KafkaListener(topics = "",groupId = "t-hello2-groupId")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
