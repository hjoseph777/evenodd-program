package com.evenodd;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public int getNumberFromUser() {
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    public void displayResults(List<SequenceStep> results) {
        for (SequenceStep step : results) {
            System.out.println(step);
        }
    }
}
