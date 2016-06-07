package com.rm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.rm.dao.repo.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@EnableAutoConfiguration
@Configuration
@ComponentScan({ "com.rm.web", "com.rm.services" })
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}