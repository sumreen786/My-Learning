package org.example.programPractice;


// 4.	Create a class Calculator with a method to add two numbers.
// Create an object and call the method.

public class Calculator {

    int sumCal(int a, int b){
        return a+b;

    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int result = cal.sumCal(2,5);
        System.out.println("The sum of two numbers is: " + result );
    }

}
