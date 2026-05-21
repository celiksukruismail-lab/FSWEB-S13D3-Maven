package org.example;

public class Main {
    public static void main(String[] args) {
        Person x = new Person("John", "Doe", 20);
        Person y = new Person("John", "Doe", 20, "Turkey");

        System.out.println("Firstname: " + x.getFirstName());
        System.out.println("LastName: " + x.getLastName());
        System.out.println("Age: " + x.getAge());
        System.out.println("isTeen: " + x.isTeen());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("area= " + wall.getArea());

    }

}
