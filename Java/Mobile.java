package org.example.programPractice;

// 6.	Create a class Mobile with variables model, ram, storage.
// Add a method showSpecs().Create 2 objects with different values and call the method.


public class Mobile {
    String model;
    int ram;
    int storage;

    void showSpecs() {
        System.out.println("The model of Mobile is " + model + ", RAM is " + ram + " and storage is " + storage);
    }

    Mobile(String md, int rm, int sto) {
        model = md;
        ram = rm;
        storage = sto;
    }

    public static void main(String[] args) {
        Mobile mob1 = new Mobile("Galaxy M02", 2, 32);
        Mobile mob2 = new Mobile("Galaxy M01", 4, 64);
        mob1.showSpecs();
        mob2.showSpecs();
    }

}
