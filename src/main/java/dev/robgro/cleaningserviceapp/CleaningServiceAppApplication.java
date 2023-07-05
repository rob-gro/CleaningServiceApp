package dev.robgro.cleaningserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class CleaningServiceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleaningServiceAppApplication.class, args);
    }

}
