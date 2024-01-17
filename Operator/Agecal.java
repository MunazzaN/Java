package com.java.loopsconditions;
import java.util.Scanner;
public class Agecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int age = scanner.nextInt();
        // Function to classify a person based on age

        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}

