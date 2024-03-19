package com.example.configs;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(KafkaConstraints.KAFKA_TOPIC_NAME)
                .partitions(10)
                .replicas(1)
                .build();
    }

}
