package com.braden0006.energyusage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EnergyUsageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnergyUsageApplication.class, args);
    }

    @GetMapping("/")
    public String homePage() {
        return "Please enter login information";
    }
}
