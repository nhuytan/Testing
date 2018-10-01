/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;

/**
 *
 * @author Tan Nguyen
 */
public class Chapter2Quiz {

    public static void chapter2Quiz() {
        //variables
        int cookies;
        float serving, calories;
        final int COOKIES_IN_BAG = 50;
        final int SERVING_IN_BAG = 10;
        final int CALORIES_PER_SERVING = 350;
        //input
        System.out.println("Please enter the number of cookies you ate:");
        Scanner input = new Scanner(System.in);
        cookies = input.nextInt();
        //processing
        serving = (float) (cookies * SERVING_IN_BAG) / COOKIES_IN_BAG;
        calories = serving * CALORIES_PER_SERVING;
        //output
        System.out.println("Number of cookies ate: " + cookies);
        System.out.println("Number of calories consumed " + calories);

    }
}
