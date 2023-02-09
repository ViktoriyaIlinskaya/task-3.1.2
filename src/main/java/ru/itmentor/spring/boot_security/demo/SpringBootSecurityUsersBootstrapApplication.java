package ru.itmentor.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityUsersBootstrapApplication {

    private static Start start;

    public SpringBootSecurityUsersBootstrapApplication(Start start) {
        this.start = start;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityUsersBootstrapApplication.class, args);
        start.run();
    }
}
