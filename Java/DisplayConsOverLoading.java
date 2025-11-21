package org.example.programPractice;


/*
Create a class Display with two show() methods:
show(String name) → prints name
show(int age) → prints age
Create an object and call both methods.
 */
public class DisplayConsOverLoading {

    void show(String name) {
        System.out.println("Name of the Girl is " + name);
    }

    void show(int age) {
        System.out.println("Age of the Girl is " + age);
    }

    public static void main(String[] args) {
        DisplayConsOverLoading d = new DisplayConsOverLoading();
        d.show("Farheen");
        d.show(9);
    }
}
