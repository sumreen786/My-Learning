package org.example.programPractice;

/*
Create a class Employee with:
•	Only one constructor (name)
•	Another constructor (name, salary)
•	Print values for both objects.

 */
public class Employee {
    String n;
    int sal;

    Employee(String name) {
        this.n = name;
    }

    Employee(String name, int salary) {
        this.n = name;
        this.sal = salary;
    }

    void showEmployee() {
        System.out.println("Name: " + n);
        if (sal != 0) {
            System.out.println("Salary: " + sal);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Employee em = new Employee("Farheen");
        Employee em1 = new Employee("Sumreen ", 66000);
        em.showEmployee();
        em1.showEmployee();
    }
}
