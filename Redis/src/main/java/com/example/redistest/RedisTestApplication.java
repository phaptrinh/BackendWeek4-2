package com.example.redistest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RedisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisTestApplication.class, args);
    }

    @Autowired
    RedisTemplate redisTemplate;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            listExample();
        };
    }

    public void listExample() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Redis");

//        redisTemplate.opsForList().rightPushAll("likelion", list);

        System.out.println("Size of key likelion: " + redisTemplate.opsForList().size("likelion"));

        redisTemplate.opsForValue().set("key4", "value4");

        System.out.println();
    }


}
