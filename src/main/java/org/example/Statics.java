package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Statics {

    public static int opcMenu() {
        int opc = 0;
        do {
            System.out.println("**** Menu ****");
            System.out.println("1- Password with uppercase and lowercase letters");
            System.out.println("2- Password with numbers and symbols");
            System.out.println("3- Go out");
            System.out.println("Select an option please ->");
            try {
                opc = new Scanner(System.in).nextInt();
                if (opc < 1 || opc > 3) {
                    throw new Exception("The number entered is not among the options, please choose a valid option again");
                }
            } catch (InputMismatchException ime) {
                System.out.println("The data entered is not among the options, please choose a valid option again");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (opc < 1 || opc > 3);
        return opc;
    }

    public static int passwordLength(){
        int num = 0;
        boolean goOut = false;
        do {
            System.out.println("Enter the length of the password you want to generate ->");
            try {
                num = new Scanner(System.in).nextInt();
                goOut = true;
            } catch (InputMismatchException ime) {
                System.out.println("The entered number is not an integer, please enter a number again");
            }
        } while (!goOut);
        return num;
    }

}
