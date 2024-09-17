package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double a = getInput(scanner, "Skriv første tal: ");
        double b = getInput(scanner, "Skriv andet tal: ");

        System.out.println("Vælg operator (+, -, *, /):");
        String operator = scanner.next();
try{
        switch (operator) {
            case "+":
                System.out.println(calculator.add(a, b));
                break;
            case "-":
                System.out.println(calculator.subtract(a, b));
                break;
            case "*":
                System.out.println(calculator.multiply(a, b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println(calculator.divide(a, b));
                } else {
                    System.out.println("Fejl: Division med nul er ikke tilladt.");
                }
                break;
            default:
                System.out.println("Ugyldig operator.");
        }

        } catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
        }
    }

    private static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}


