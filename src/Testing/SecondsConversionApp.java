/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Tan Nguyen
 */
public class SecondsConversionApp {

    public static void test1() {
        final int SEC_PER_HOUR = 3600, SEC_PER_MIN = 60;
        int totalSeconds, hours, minutes, remainingSeconds;
        // input
        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Please enter total seconds:");
        // input from Dialog box
       
       String input = JOptionPane.showInputDialog("Enter the total seconds:");
        totalSeconds = Integer.parseInt(input);
        // Processing
        hours = totalSeconds / SEC_PER_HOUR;
        remainingSeconds = totalSeconds % SEC_PER_HOUR;
        minutes = remainingSeconds / SEC_PER_MIN;
        remainingSeconds = remainingSeconds % SEC_PER_MIN;
        //output
        String output ="Total Seconds: "+totalSeconds+"\n"+ "Hour: "+hours+"\n"+"Minutes: "+minutes+"\n"+"Seconds: "+remainingSeconds+"\n";
        //JOptionPane.showMessageDialog(null, "Total Seconds: "+totalSeconds,output , 1, null);
        JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);
//        System.out.println("Total Seconds: "+totalSeconds);
//        System.out.println("Hour: "+hours);
//        System.out.println("Minutes: "+minutes);
//        System.out.println("Seconds: "+remainingSeconds);
        
    }

    public static void test2() {
        int userIn = Integer.MAX_VALUE;   // where x could be some value that you're expecting the user will not enter it, you could Integer.MAX_VALUE
        Scanner keyboard = new Scanner(System.in);
        try {
            userIn = Integer.parseInt(keyboard.next());
        } catch (NumberFormatException a) {
            System.out.println("Problem");
        }
    }
}
