package com.evenodd;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {
    private final List<SequenceStep> results;

    public NumberProcessor() {
        this.results = new ArrayList<>();
    }

    public void processSequence(List<Integer> sequence) {
        for (int number : sequence) {
            boolean isEven = isEven(number);
            results.add(new SequenceStep(number, isEven, isEven ? number / 2 : 3 * number + 1));
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public List<SequenceStep> getResults() {
        return results;
    }
}
