package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Sandwich Shop application
        // This application will let users order a simple sandwich and calculate the price
        // The customer may receive a discount based on their age

        System.out.println("=============================");
        System.out.println("WELCOME TO THE SANDWICH SHOP!");
        System.out.println("=============================");

        System.out.println();

        // Assign sandwich cost to their sizes
        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double sandWichPrice = 0.0; // Placeholder variable to selected sandwich price

        // 1. Prompt the user for the size of the sandwich (1 or 2):
        Scanner read = new Scanner(System.in);
        System.out.print("Which sandwich would you like to buy? Type 1 for regular, 2 for large: ");
        int sandWichSize = read.nextInt();

        if (sandWichSize == 1) {
            sandWichPrice = regularSandwichPrice; // Sets sandwich price to selected size
        }
        else if (sandWichSize == 2) {
            sandWichPrice = largeSandwichPrice;
        }
        else {
            System.out.println("Invalid sandwich size.");
            return;
        }

        // Cleans the CLRF
        read.nextLine();

        // 3. Loaded Sandwich (Exercise 2)
        // Ask if the customer would like a loaded sandwich
        double loadedRegular = 1.00;
        double loadedLarge = 1.75;

        System.out.print("Would you like a loaded sandwich? ");
        String loadedChoice = read.nextLine();

        if (loadedChoice.equalsIgnoreCase("Yes")) {
            if (sandWichSize == 1) {
                sandWichPrice = regularSandwichPrice + loadedRegular;
            }
            else if (sandWichSize == 2) {
                sandWichPrice = largeSandwichPrice + loadedLarge;
            }
        }


        // 2. Prompt the user for their age
        System.out.print("How old are you? ");
        int customerAge = read.nextInt();

        double discountRate = 0.0; // Placeholder discount rate to hold selected discount

        if (customerAge <= 17) {
            discountRate = 0.10;
        }
        else if (customerAge >= 65) {
            discountRate = 0.20;
        }
        else {
            System.out.println("No discount applicable.");
        }

        // Close the scanner
        read.close();

        // 3. Calculate the final price
        double finalPrice = sandWichPrice - (sandWichPrice * discountRate);
        System.out.printf("The price of your sandwich is $%.2f%n", finalPrice); // Doing f helps format result better
    }
}