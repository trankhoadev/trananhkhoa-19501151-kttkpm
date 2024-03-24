package com.me.exercise;
import java.util.Scanner;

public class PolynomialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the polynomial expression
        System.out.print("Enter the polynomial expression: ");
        String polynomial = scanner.nextLine();

        // Prompt the user to enter the value of 'x'
        System.out.print("Enter the value of 'x': ");
        double x = scanner.nextDouble();

        // Remove whitespaces and split the polynomial string into terms
        String[] terms = polynomial.replaceAll("\\s+", "").split("(?=[-+])");

        // Initialize the result
        double result = 0.0;

        // Evaluate each term and accumulate the result
        for (String term : terms) {
            if (term.isEmpty()) continue;
            double termResult = evaluateTerm(term, x);
            result += termResult;
        }

        // Print the final result
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Method to evaluate a single term of the polynomial
    private static double evaluateTerm(String term, double x) {
        double coefficient = 1.0;
        double exponent = 0.0;

        // Parse the coefficient and exponent from the term
        if (term.contains("x")) {
            if (term.charAt(0) == '-') {
                coefficient = -1.0;
            } else if (term.charAt(0) != '+') {
                coefficient = Double.parseDouble(term.substring(0, term.indexOf("x")));
            }

            if (term.contains("^")) {
                exponent = Double.parseDouble(term.substring(term.indexOf("^") + 1));
            } else {
                exponent = 1.0;
            }
        } else {
            coefficient = Double.parseDouble(term);
        }

        // Evaluate the term for the given value of 'x'
        return coefficient * Math.pow(x, exponent);
    }
}
