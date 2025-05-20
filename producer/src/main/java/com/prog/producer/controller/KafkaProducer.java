package com.prog.producer.controller;

import com.prog.producer.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage() {
        RiderLocation location = new RiderLocation("123", 12.34, 56.78);
        kafkaTemplate.send("my-topic-new", location);
        return "Message sent:" + location.getRiderId();
    }
}
