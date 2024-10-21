package com.example.bowlingcalculator;

import org.springframework.boot.SpringApplication;

public class TestBowlingCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.from(BowlingCalculatorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
