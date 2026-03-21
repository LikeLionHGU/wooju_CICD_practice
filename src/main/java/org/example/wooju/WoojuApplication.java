package org.example.wooju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WoojuApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoojuApplication.class, args);
    }

}