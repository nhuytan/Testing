/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author nhuyt
 */
public class Chapter3Practice {

    public static void Question6() {
        boolean isPremiumCustomer;
        int nBooksPurchased, freeBooks = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Is customer a Premium Customer? \"true\" or \"false\" ");
        isPremiumCustomer = input.nextBoolean();
        System.out.println("Input number of books purchased");
        nBooksPurchased = input.nextInt();

        if (isPremiumCustomer) {
            if (nBooksPurchased >= 5 && nBooksPurchased < 8) {
                freeBooks = 1;
            } else if (nBooksPurchased >= 8) {
                freeBooks = 2;
            }
        } else {
            if (nBooksPurchased >= 7 && nBooksPurchased < 12) {
                freeBooks = 1;
            } else if (nBooksPurchased >= 12) {
                freeBooks = 2;
            }
        }
        System.out.println("Number of Free Books is " + freeBooks);

    }

    public static void Question6a() {
        boolean isPremiumCustomer;
        int nBooksPurchased, freeBooks = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Is customer a Premium Customer? \"true\" or \"false\" ");
        isPremiumCustomer = input.nextBoolean();
        System.out.println("Input number of books purchased");
        nBooksPurchased = input.nextInt();

        if (isPremiumCustomer) {
                if (nBooksPurchased >= 5 && nBooksPurchased < 8) {
                    freeBooks = 1;
                } else if (nBooksPurchased >= 8) {
                    freeBooks = 2;
                }
            }
            else {
                if (nBooksPurchased >= 7 && nBooksPurchased < 12) {
                    freeBooks = 1;
                } else if (nBooksPurchased >= 12) {
                    freeBooks = 2;
                }

            }
            System.out.println("Number of Free Books is " + freeBooks);

        }
    }
