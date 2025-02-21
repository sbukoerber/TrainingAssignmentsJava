package com.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class ProducerService {

    private KafkaTemplate<String, String> kafkaTemplate;

    private String topicName;

    public void sendMessage(String message) {
        kafkaTemplate.send("t-hello2 Partition", message);
    }

    @Autowired
    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

}
