package org.example.second;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            try {
                int n = scan.nextInt();
                int p = scan.nextInt();
                MyCalculator myCalculator = new MyCalculator();
                long res = myCalculator.power(n, p);
                System.out.println(res);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }
}
class MyCalculator{
    public long power(int n, int p) throws Exception {
        if (n==0 && p==0){
           throw new Exception("n and p should not be zero.");
        }
        if (n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(n,p);
    }
}