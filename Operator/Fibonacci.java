package com.java.loopsconditions;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int  k;
        int first=0, second=1;

        System.out.print("Enter a Number:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<=N-1; i++) {
            System.out.println(first);
            k=first+second;
            first=second;
            second=k;

        }
        scanner.close();
    }

}

