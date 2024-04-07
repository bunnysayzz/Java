// Write a menu driven program which prompts the user to enter [1. Saving Account
// 2. Current Account]
// Ask the user to enter the age. If the age is less than 18 then print “current account can not be opened” and if the age is less than 21 but user is eligible for current account then print “saving account can not be opened but you can open current account”. Otherwise print “You are not eligible for Saving Account”.
// If the user is eligible for given type of account then print "You are eligible to open the CURRENT/SAVING account"

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Account Opening Portal!");
        System.out.println("Please select the type of account:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");

        int accountType = scanner.nextInt();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if (accountType == 1) { // Saving Account
            if (age < 18) {
                System.out.println("Saving account cannot be opened.");
            } else if (age < 21) {
                System.out.println("Saving account cannot be opened but you can open a current account.");
            } else {
                System.out.println("You are eligible to open the Saving account.");
            }
        } else if (accountType == 2) { // Current Account
            if (age < 18) {
                System.out.println("Current account cannot be opened.");
            } else {
                System.out.println("You are eligible to open the Current account.");
            }
        } else {
            System.out.println("Invalid account type selected.");
        }

        scanner.close();
    }
}
