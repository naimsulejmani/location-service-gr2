package dev.naimsulejmani.locationservicegr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LocationServiceGr2Application {

    public static void main(String[] args) {
        SpringApplication.run(LocationServiceGr2Application.class, args);
    }

}
