package com.sda.examples.spring.bootdemo;

import com.sda.examples.spring.bootdemo.repository.CountryStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootdemoApplication{


    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }

}
