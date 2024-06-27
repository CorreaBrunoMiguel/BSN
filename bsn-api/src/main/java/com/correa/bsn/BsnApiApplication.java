package com.correa.bsn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BsnApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsnApiApplication.class, args);
    }

}
