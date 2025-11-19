package org.example.programPractice;
// Create a class Car with variables brand, color, price.
// Create two objects and print their details.

public class Car {

    String brand;
    String color;
    int price;


    void printCarData() {
        System.out.println("The Car is of the Brand " +
                brand + " ,Color is " + color + " and price is " + price + ".");
    }

    Car(String br, String col, int pr) {
        brand = br;
        color = col;
        price = pr;
    }

    public static void main(String[] args) {
        Car cr = new Car("Honda", "red", 400000);
        cr.printCarData();
    }
}
