package org.example.programPractice;

// 3.	Create a class Book with one method displayInfo() that prints a message.
// Create an object and call the method.
public class Book {

    void displayInfo() {
        System.out.println("Show me a family of readers, " +
                "and I will show you the people who move the world.");

    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.displayInfo();

    }
}
