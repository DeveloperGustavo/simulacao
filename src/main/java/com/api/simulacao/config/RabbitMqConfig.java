//package com.api.simulacao.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.amqp.core.Queue;
//
//@Configuration
//public class RabbitMqConfig {
//
//    @Value("${queue.simulacao.name}")
//    String simulacaoQueue;
//
//    @Bean
//    public Queue queue() {
//        return new Queue(this.simulacaoQueue);
//    }
//}
