package org.example.second;

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperation isOdd(){
        return i -> i % 2 != 0;
    }
    PerformOperation isPrime(){
        return i -> {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        };
    }
    PerformOperation isPalindrome(){
        return i -> {
            String input = Integer.toString(i);
            char[] chars = input.toCharArray();
            String output = "";
            for (char ch:chars) {
                output = ch + output;
            }
            return output.equals(input);
        };
    }


}
    // Write your code here

    public class Solution12 {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);

                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());

                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }
