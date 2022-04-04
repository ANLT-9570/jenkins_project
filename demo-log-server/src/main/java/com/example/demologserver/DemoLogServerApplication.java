package com.example.demologserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAdminServer
@SpringBootApplication
public class DemoLogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLogServerApplication.class, args);
    }

}
