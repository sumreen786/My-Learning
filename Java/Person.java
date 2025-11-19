package org.example.programPractice;

//5.Create a class Person with variables name, city.
// Assign values using a constructor. Print them.

public class Person {
    String name;
    String city;


    Person(String nm, String ct) {
         name = nm;
         city = ct;
    }

    void printPersonData() {

        System.out.println("The Person Name is " + name + " and stay in " + city);
    }

    public static void main(String[] args) {
        Person pr = new Person("Farheen", "Bengaluru");
        pr.printPersonData();

    }
}
