package com.qwertcardo.consumer.listeners;

import com.qwertcardo.consumer.kafka.PublishingMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PublishingListener {
    private final Logger logger = LoggerFactory.getLogger(PublishingListener.class);

    @KafkaListener(topics = "publishing_topico", groupId = "CONSUMER_APPLICATION_EXAMPLE_GROUP", containerFactory = "publishingContainerFactory")
    public void publishingListener(PublishingMessage message) {
        logger.info("\n Publishing Kafka Listener received value: \n {}", message);

        // LOGICA DE NEGOCIO
    }
}
