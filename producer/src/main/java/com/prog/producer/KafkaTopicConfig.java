package com.prog.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
//
//    @Bean
//    public NewTopic createTopic() {
//        //Here my-topic-new is the topic name, and 3 is the number of partitions, and 1 is the replication factor
//        return new NewTopic("my-topic-new ", 3, (short) 1);
//    }
}
