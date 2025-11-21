package org.example.programPractice;

/*
Create a class Laptop with:
Variables: brand, price
Constructor to initialize both
Method showDetails() to print details
Create 2 objects and call the method.
 */
public class Laptop {

    String brand;
    int price;


    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    void showDetails() {
        System.out.println("Brand of Laptop " + brand + " and Price is " + price);
    }

    public static void main(String[] args) {

        Laptop l = new Laptop("HP", 45000);
        Laptop l1 = new Laptop("DELL", 56000);
        l.showDetails();
        l1.showDetails();


    }
}
