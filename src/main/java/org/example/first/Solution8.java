package org.example.first;

import java.util.Scanner;

public class Solution8 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lengthSum = A.length() + B.length();
        String lex;
        if (A.compareTo(B)<=0){
            lex = "No";
        }else {
            lex = "Yes";
        }
        String out = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()
                + " "
                + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(lengthSum);
        System.out.println(lex);
        System.out.println(out);

    }
}