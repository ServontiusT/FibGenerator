package org.servontiusturner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence:");
        int firstNumber = 0;
        int secondNumber = 1;
        int currentNumber;

        for (int counter = 1; counter <= 20; counter++) {
            currentNumber = firstNumber + secondNumber;

            System.out.println(currentNumber);

            firstNumber = secondNumber;
            secondNumber = currentNumber;
        }

    }
}