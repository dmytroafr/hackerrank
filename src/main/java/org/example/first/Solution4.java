package org.example.first;

import java.util.Scanner;

public class Solution4 {
    public static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();
    public static boolean flag = check();
    public static boolean check(){
        if (B>0 && H>0){
            return true;
        }
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
