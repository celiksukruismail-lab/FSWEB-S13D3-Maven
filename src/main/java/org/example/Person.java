package org.example;

public class Person {
    String firstName;
    String lastName;
    String email;
    int age;
    int number;
    String from;


    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String from, int number) {
        this.from = from;
        this.number = number;
    }
    public Person (String firstName, String lastName, int age, String from) {
       this(firstName, lastName, age);
       this.from = from;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
