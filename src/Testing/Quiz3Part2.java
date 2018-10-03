
package Testing;

/**
 * @author Tan Nguyen
 * COSC 1436 Java Quiz 3 Part 2
 */
public class Quiz3Part2 {

    public static void Question1() {
        //variable declaration
        char code = 0;
        double rate;
        switch (code) {
            case '1':
                rate = 0.02;
                break;
            case '2':
            case '3':
            case '4':
                rate = 0.02;
                break;
            case '5':
                rate = 0.1;
                break;
            case '6':
            case '7':
                rate = 0.15;
            default:
                rate = -1;
        }
    }

    public static void Question2() {
        //variable declaration
        char code = 0;
        double rate;
        if (code == '1') {
            rate = 0.02;
        } else if (code == '2' || code == '3' || code == '4') {
            rate = 0.05;
        } else if (code == '5') {
            rate = 0.1;
        } else if (code == '6' || code == '7') {
            rate = 0.15;
        } else {
            rate = -1;
        }
    }

    public static void Question3() {
        //variable declaration
        int grade = 2;

        if (grade >= 0 && grade <= 100) {
            System.out.println("The number is valid");
        }
    }

    public static void Question4() {
        //variable declaration
        int hours = 2;
        if (hours < 0 || hours > 80) {
            System.out.println("The number is not valid");
        }
    }

    public static void Question5() {
        //variable declaration
        double discount, price = 0;
        int dept = 0;

        switch (dept) {
            case 5:
                if (price >= 100) {
                    discount = 0.20;
                } else {
                    discount = 0.10;
                }
                break;
            default:
                if (price >= 100) {
                    discount = 0.15;
                } else {
                    discount = 0.05;
                }
        }
    }
    

}


