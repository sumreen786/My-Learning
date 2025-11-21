package org.example.programPractice;
/*
Create a class Pen with:
•	Variables: color, price
•	A method info() to print both
•	Create an object and call the method.

 */
public class Pen {

    String color;
    int price;

    void info(){
       System.out.println("Color of Pen is " + color + " and Price is " + price );
    }
    public static void main(String[] args){
        Pen p = new Pen();
        p.color="Red";
        p.price=15;
        p.info();
    }

}
