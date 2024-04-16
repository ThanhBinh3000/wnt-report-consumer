package vn.com.gsoft.report.service;

import org.springframework.kafka.support.SendResult;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface KafkaProducer {
    SendResult<String, String> sendInternal(String topic, String payload) throws InterruptedException, ExecutionException, TimeoutException;

    SendResult<String, String> sendInternal(String topic, String key, String payload) throws InterruptedException, ExecutionException, TimeoutException;
}

