package com.example.bowlingcalculator.calc;

import com.example.bowlingcalculator.Frame;

import java.util.List;

public class BowlingCalculator {

    public int calculateBowl(List<Frame> frames){
        int total = 0;
        boolean wasSpare = false;

        for (Frame frame : frames) {
            if (wasSpare) {
                total += frame.firstThrow();
            }
            total += frame.firstThrow() + frame.secondThrow();
            wasSpare = isSpare(frame.firstThrow(), frame.secondThrow());
        }
        return total;
    }

    private boolean isSpare(int first, int second) {
        return first + second == 10;
    }

}
