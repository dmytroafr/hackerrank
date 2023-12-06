package org.example.first;

import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int l = 0; l < n; l++) {
                int out = a;
                for (int k = 0; k <= l; k++) {
                    out += (int) Math.pow(2, k) * b;
                }
                System.out.print(out + " ");
            }
            System.out.println();
        }
        in.close();
    }
}