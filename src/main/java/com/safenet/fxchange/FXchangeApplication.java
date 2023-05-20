package com.safenet.fxchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FXchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FXchangeApplication.class, args);
    }

}
