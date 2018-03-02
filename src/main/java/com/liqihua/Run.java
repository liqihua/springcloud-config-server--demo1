package com.liqihua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Run {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Run.class);
        app.run(args);
    }

}
