/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class COSC1436 {

    public static void main(String[] args) {

            //SecondsConversionApp.test1();
            //SecondsConversionApp.test2();
          // Chapter2Quiz.chapter2Quiz();
           //Chapter3Practice.Question6();
           //Form1 form1 = new Form1();
           //form1.setVisible(true);
//           jFrame1 j = new jFrame1();
//           j.setLocationRelativeTo(null);
//           j.setVisible(true);
           

        System.out.print("\nProgram stop\n");
    }

    private static void convertToBinary1(String s) {
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                System.out.print((val & 128) + "\n");
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);

    }

    private static void convertToBinary2(String s) {
        //String str = "CC%";
        String result = "";
        char[] messChar = s.toCharArray();

        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }

        System.out.println(result);
    }

    private static void convertToBinary3(String s) {

        int k = Integer.parseInt(s);
        String out = Integer.toBinaryString(k);
        System.out.println("Binary: " + out);
    }

    // checkString: if has character: false, number:true
    private static boolean checkString(String s) {
        for (int i = 0; i < (s.length()); i++) {
            int j = Character.getNumericValue(s.charAt(i));
            if (j < 0 || j > 9) {
                return false;
            }
        }
        return true;
    }

    private static void calculate() {

        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: \n");
        String s = input.next();

        while (!checkString(s)) {
            System.out.print("Invalid input number\n");
            System.out.print("Please input a valid number\n");
            s = input.next();
        }
        String s1 = s.substring(s.length() - 1);
        System.out.print("The last digit of number " + s + " is: " + s1 + "\n");

    }

    private static void test1() {
        Scanner sc = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            System.out.println("Type a double-type number:");
            try {
                userInput = Double.parseDouble(sc.next());
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input");
            }
        }
    }

}
