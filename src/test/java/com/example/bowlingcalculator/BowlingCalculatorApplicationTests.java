package com.example.bowlingcalculator;

import com.example.bowlingcalculator.calc.BowlingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BowlingCalculatorApplicationTests {

    @Test
    void contextLoads() {
    }



}
