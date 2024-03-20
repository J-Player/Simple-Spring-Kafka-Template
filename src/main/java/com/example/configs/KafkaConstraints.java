package com.example.configs;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class KafkaConstraints {
    public static final String BOOTSTRAP_SERVER = "127.0.0.1:9092";
    public static final String TOPIC_NAME = "topic-name";
    public static final String GROUP_ID = "group-1";
}
