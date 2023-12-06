package org.example.first;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] phrase;
        if (!s.isBlank()){
            phrase = s.trim().split("[ !,?._'@]+");
            System.out.println(phrase.length);
            for (String str :phrase) {
                System.out.println(str);
            }
        } else {
            System.out.println('0');
        }





        // Write your code here.
        scan.close();
    }
}