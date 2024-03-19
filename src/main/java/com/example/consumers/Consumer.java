package com.example.consumers;

import com.example.configs.KafkaConstraints;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = KafkaConstraints.KAFKA_TOPIC_NAME, groupId = KafkaConstraints.KAFKA_GROUP_ID)
    public void receiveMessage(String message) {
        log.info("Message received: {}", message);
    }

}
