package com.factory.vehicle.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.factory.vehicle.controller","com.factory.vehicle.service"})
public class FactoryVehicleApplication {
    public static void main(String[] args) {
        SpringApplication.run(FactoryVehicleApplication.class, args);
    }

}
