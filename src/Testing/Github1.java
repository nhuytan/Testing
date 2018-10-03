/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 *
 * @author nhuyt
 */
public class Github1 {

    public static void test1() {
        System.out.println("test1");
        LocalDateTime d = LocalDateTime.now();
        System.out.printf("%ty\n", d);

        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        long mls = System.currentTimeMillis();
        String time = String.format("%tT %tZ", mls, mls);
        System.out.println("TIME: " + time + " \n");
    }

}
