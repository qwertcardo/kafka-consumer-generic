package com.qwertcardo.consumer.listeners;

import com.qwertcardo.consumer.kafka.UserMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {
    private final Logger logger = LoggerFactory.getLogger(UserListener.class);

    @KafkaListener(topics = "user_topico", groupId = "CONSUMER_APPLICATION_EXAMPLE_GROUP", containerFactory = "userContainerFactory")
    public void userListener(UserMessage message) {
        logger.info("\n User Kafka Listener received value: \n {}", message);
    }
}
