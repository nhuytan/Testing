/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;

/**
 *
 * @author Tan Nguyen Purpose: This program demonstrates switch using
 * menu-driven example
 */
public class Chapter3Exercise_3 {

    public static void test() {
        //variables declaration
        boolean loop = true;
        int firstNumber = 32, secondNumber = 0;
        int menuSelection;
        double result = 0;
        boolean canDisplay = true;
        String decision;
        do {
            //display menu
            System.out.println("Math Tutoring Program\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit the Program\n");
            //get menu selection
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your selection");
            menuSelection = input.nextInt();
            //get user input
            System.out.println("Enter first number");
            firstNumber = input.nextInt();
            System.out.println("Enter second number");
            secondNumber = input.nextInt();
            //process the menu selection
            switch (menuSelection) {
                case 1:
                    result = firstNumber + secondNumber;
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Divide by zero error!!");
                        canDisplay = false;
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;
                case 5:
                    System.out.println("Program exit\n");
                    canDisplay = false;
                    break;
                default:
                    System.out.println("Invalid selection");
                    canDisplay = false;
            }
            //display output
            if (canDisplay) {
                System.out.println("Result is: " + result);
            }
            //loop
            System.out.println("Do you want to do again \"Y-Yes\" or \"N-No\" ");
            decision = input.next();
            loop = (decision.equals("Y")) | (decision.equals("y"));
        } while (loop);

    }

    public static void test2() {
        //variables declaration
        boolean loop = true;
        int numBookPurchased = 0, coupons = 0;
        int menuSelection;
        double result = 0;
        boolean canDisplay = true;
        String decision;
        do {
            //get user selection
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your book purchased");
            numBookPurchased = input.nextInt();

            //process the menu selection
            if (numBookPurchased < 1) {
                coupons = 0;
            } else if (numBookPurchased < 3) {
                coupons = 1;
            } else if (numBookPurchased < 5) {
                coupons = 2;
            } else if (numBookPurchased >= 5) {
                coupons = 3;
            }
            System.out.println("You purchased  " + numBookPurchased+" books.");
            System.out.println("You get " + coupons +" free books.");
            System.out.println("=============================================================");
            System.out.println("Do you want to do again \"Y-Yes\" or \"N-No\" ");
            decision = input.next();
            loop = (decision.equals("Y")) | (decision.equals("y"));
        } while (loop);

    }
}
