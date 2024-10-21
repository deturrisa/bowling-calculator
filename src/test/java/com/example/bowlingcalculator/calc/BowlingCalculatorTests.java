package com.example.bowlingcalculator.calc;


import com.example.bowlingcalculator.Frame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;


public class BowlingCalculatorTests {
    @Test
    public void test_CalculateBowl() {
        Frame frame = new Frame(1,2);

        BowlingCalculator calculator = new BowlingCalculator();

        int result = calculator.calculateBowl(List.of(frame));

        Assertions.assertEquals(3,result);

    }

    @Test
    public void test_Calculate2Bowl() {
        Frame frame1 = new Frame(1,2);
        Frame frame2 = new Frame(1,2);

        BowlingCalculator calculator = new BowlingCalculator();

        int result = calculator.calculateBowl(List.of(frame1,frame2));

        Assertions.assertEquals(6,result);

    }

    @Test
    public void test_Calculate2Bowl_1Spare_1Bowl() {
        Frame frame1 = new Frame(1,2); // 1 + 2 = 3
        Frame frame2 = new Frame(1,2); // 1 + 2 + 3 = 6
        Frame frame3 = new Frame(3,7); // 10 + 6 (spare)
        Frame frame4 = new Frame(4,3); // 7 + 16 + 4
        // 7(current frame) + 16 (previous spare)  + 4 (first throw current frame)

        BowlingCalculator calculator = new BowlingCalculator();

        int result = calculator.calculateBowl(List.of(frame1,frame2,frame3,frame4));

        Assertions.assertEquals(27,result);

    }

    @Test
    public void test_Calculate2Bowl_2Spare_1Bowl() {
        Frame frame1 = new Frame(1,2); // 1 + 2 = 3
        Frame frame2 = new Frame(1,2); // 1 + 2 + 3 = 6
        Frame frame3 = new Frame(3,7); // 10 + 6 = 16 (spare)
        Frame frame4 = new Frame(7,3); // 10 + 16 + 7 = 33 (spare)
        Frame frame5 = new Frame(2,3); // 5 + 33 + 2 = 40

        BowlingCalculator calculator = new BowlingCalculator();

        int result = calculator.calculateBowl(List.of(frame1,frame2,frame3,frame4,frame5));

        Assertions.assertEquals(40,result);

    }


    @Test
    public void crazy_test() {
        Frame frame1 = new Frame(7,3);
        Frame frame2 = new Frame(6,4);
        Frame frame3 = new Frame(9,1);
        Frame frame4 = new Frame(5,4);
        Frame frame5 = new Frame(3,2);
        Frame frame6 = new Frame(8,2);
        Frame frame7 = new Frame(3,4);
        Frame frame8 = new Frame(5,4);
        BowlingCalculator calculator = new BowlingCalculator();

        int result = calculator.calculateBowl(List.of(frame1,frame2,frame3,frame4,frame5,frame6,frame7,frame8));

        Assertions.assertEquals(93,result);

    }
}
