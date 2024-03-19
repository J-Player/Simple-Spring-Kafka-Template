package com.example.configs;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class KafkaConstraints {
    public static final String KAFKA_TOPIC_NAME = "topic-name";
    public static final String KAFKA_GROUP_ID = "group-1";
}
