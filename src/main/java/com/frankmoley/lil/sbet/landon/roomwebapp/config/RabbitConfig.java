package com.frankmoley.lil.sbet.landon.roomwebapp.config;

import com.frankmoley.lil.sbet.landon.roomwebapp.async.Receiver;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class RabbitConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }

}