package com.prog.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    // This method will be called whenever a message is received from the Kafka topic
    // The topic name and group ID should match those used in the producer
    @KafkaListener(topics = "my-topic", groupId = "my-groud-id")
    public void listen1(String message) {
        System.out.println("Received message 1: " + message);
    }

    @KafkaListener(topics = "my-topic", groupId = "my-groud-id")
    public void listen2(String message) {
        System.out.println("Received message 2: " + message);
    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-group-rider")
    public void listenRiderLocation(RiderLocation location) {
        System.out.println("Received Location: " + location.getRiderId() +
                ", " + location.getLatitude() + ", " + location.getLongitude());
    }
}
