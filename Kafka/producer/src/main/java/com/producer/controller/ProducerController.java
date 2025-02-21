package com.producer.controller;

import com.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public class ProducerController {
    private ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PutMapping
    public void sendMessage(@PathVariable String message) {
        producerService.sendMessage(message);
    }
}
