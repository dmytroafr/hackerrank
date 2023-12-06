package org.example.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution25 {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = b.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(b.nextInt());
        }
        int res = 0;
        for (int i = 0; i < list.size()-1; i++) {
            int lineS = list.get(i);
            if (lineS<0){
                res++;
            }
            for (int j = i+1; j < list.size()-i; j++) {
                lineS += list.get(j);
                if (lineS<0) res++;
            }

        }

        System.out.println(res);


    }
}