package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
        if (age <= 0) {
            System.out.println("Enter correct age");
        }
    }

    public static void main(String[] args) {
        Cinema.access(-4);

    }
}
