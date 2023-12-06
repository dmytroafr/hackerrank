package org.example.first;

import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        char[] input = A.toCharArray();
        char[] newOne = new char[input.length];

        for (int i = 0, j = A.length()-1; i < A.length(); i++,j--) {
            newOne[i] = input[j];
        }
        String out = String.copyValueOf(newOne);

        if (A.equals(out)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}