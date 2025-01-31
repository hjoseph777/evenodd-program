package com.evenodd;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int current = number;
        while (current != 1) {
            if (current % 2 == 0) {
                System.out.printf("%d is even  next value is %d/2 = %d%n", current, current, current/2);
                current = current / 2;
            } else {
                System.out.printf("%d is odd   next value is 3*%d + 1 = %d%n", current, current, 3*current + 1);
                current = 3 * current + 1;
            }
        }
        System.out.println("1 is odd");
        scanner.close();
    }
}
