package com.org.messenger.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Value("${fnbf.kafka.topic}")
	String kafkaTopic; //= "fnbf-test";
	
	public void send(String data) {
	    log.info("sending data='{}'", data);
	    kafkaTemplate.send(kafkaTopic, data);
	}
}
