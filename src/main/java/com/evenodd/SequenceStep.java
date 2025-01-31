package com.evenodd;

public class SequenceStep {
    private final int number;
    private final boolean isEven;
    private final Integer nextValue;

    public SequenceStep(int number, boolean isEven, Integer nextValue) {
        this.number = number;
        this.isEven = isEven;
        this.nextValue = nextValue;
    }

    @Override
    public String toString() {
        if (nextValue == null) {
            return number + " is " + (isEven ? "even" : "odd");
        }
        
        String calculation;
        if (isEven) {
            calculation = number + "/2 = " + nextValue;
        } else {
            calculation = "3*" + number + " + 1 = " + nextValue;
        }
        
        return String.format("%-8d is %-5s next value is %s", 
                           number, 
                           (isEven ? "even" : "odd"),
                           calculation);
    }

    public int getNumber() {
        return number;
    }

    public boolean isEven() {
        return isEven;
    }
}
