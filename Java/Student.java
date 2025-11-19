package org.example.programPractice;
//Create a class named Student with two variables: name and age.
// Create an object and assign values. Print them.
public class Student {
    String name;
    int age;


    void printStudentData(){
        System.out.println("Name of the Student is " + name + " and age is " + age);
    }
    public static void main(String[] args){

        Student stu = new Student();
        stu.name = "Sumreen";
        stu.age = 24;
        stu.printStudentData();

    }

}
