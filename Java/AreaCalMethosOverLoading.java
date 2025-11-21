package org.example.programPractice;

/*
Create a class AreaCalMethosOverLoading with two methods area():
area(int side) → prints area of square
area(int length, int breadth) → prints area of rectangle
Create an object and call both methods.
 */
public class AreaCalMethosOverLoading {

    int area(int side){
        return  side*side;
    }
    int area(int length , int breadth){
       return length*breadth;
    }

    public static void main(String[] agrs){
        AreaCalMethosOverLoading acm = new AreaCalMethosOverLoading();

        System.out.println(acm.area(2));
        System.out.println(acm.area(2,5));

    }


}
