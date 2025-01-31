package com.evenodd;

import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator {
    private final int startNumber;

    public SequenceGenerator(int startNumber) {
        this.startNumber = startNumber;
    }

    public List<Integer> generate() {
        List<Integer> sequence = new ArrayList<>();
        int current = startNumber;
        
        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = 3 * current + 1;
            }
        }
        sequence.add(1);
        return sequence;
    }

    public List<SequenceStep> generateSteps() {
        List<SequenceStep> steps = new ArrayList<>();
        int current = startNumber;
        
        while (current != 1) {
            int next;
            boolean isEven = current % 2 == 0;
            
            if (isEven) {
                next = current / 2;
            } else {
                next = 3 * current + 1;
            }
            
            steps.add(new SequenceStep(current, isEven, next));
            current = next;
        }
        
        steps.add(new SequenceStep(1, false, null));
        return steps;
    }
}
