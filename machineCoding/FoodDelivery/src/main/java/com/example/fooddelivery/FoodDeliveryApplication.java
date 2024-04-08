package com.example.fooddelivery;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Setter
@Getter
@SpringBootApplication
public class FoodDeliveryApplication {

    public static void main(String[] args) {

        SpringApplication.run(FoodDeliveryApplication.class, args);
    }

}
