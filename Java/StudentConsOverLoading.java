package org.example.programPractice;

/*
Create a class StudentConsOverLoading with:
Variables: name, age
Two constructors:
Constructor 1 → only name
Constructor 2 → name + age
Print the values by creating two objects.
 */
public class StudentConsOverLoading {

    String name;
    int age;

    StudentConsOverLoading(String n) {
        this.name = n;
    }

    StudentConsOverLoading(String n, int ag) {
        this.name = n;
        this.age = ag;
    }


    public static void main(String[] args) {
        StudentConsOverLoading sc = new StudentConsOverLoading("Nawaz");
        StudentConsOverLoading sc1 = new StudentConsOverLoading("Nawaz", 22);
        System.out.println(sc.name);
        System.out.println(sc1.name + sc1.age);


    }
}
