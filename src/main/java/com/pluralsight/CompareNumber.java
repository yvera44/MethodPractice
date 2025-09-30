package com.pluralsight;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()){
           int number = scanner.nextInt();

           boolean evenStatus = isEven(number);

            System.out.println(evenStatus);
        }
    }
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
}
