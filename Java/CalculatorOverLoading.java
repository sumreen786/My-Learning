package org.example.programPractice;

/*
Create a class CalculatorOverLoading with two methods add():
one method should add two integers
another method should add three integers
Call both methods and print the results.
 */


public class CalculatorOverLoading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorOverLoading co = new CalculatorOverLoading();
        int result = co.add(2, 5);
        int result1 = co.add(2, 5, 1);
        System.out.println("The Sum of two number is " + result);
        System.out.println("The Sum of Three number is " + result1);


    }
}
