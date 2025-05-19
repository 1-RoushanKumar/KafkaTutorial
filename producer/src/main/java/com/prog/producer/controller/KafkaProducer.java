package com.prog.producer.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    //KafkaTemplate is used to send messages to Kafka topics
    //KafkaTemplate takes two generic types: the key type and the value type
    // In this case, both are String
    private final KafkaTemplate<String, String> kafkaTemplate;

    //Constructor injection of KafkaTemplate
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //Endpoint to send a message to the Kafka topic
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        //Send the message to the topic "my-topic"
        kafkaTemplate.send("my-topic", message);
        return "Message sent:" + message;
    }
}
