package com.prog.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    // This method will be called whenever a message is received from the Kafka topic
    // The topic name and group ID should match those used in the producer
    @KafkaListener(topics = "my-topic" , groupId = "my-groud-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
