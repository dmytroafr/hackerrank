package org.example.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int res = a/b;
            System.out.println(res);
        } catch (ArithmeticException excep) {
            System.out.println(excep);
        } catch (InputMismatchException excep) {
            System.out.println(excep.getClass().getName());
        }


    }
}