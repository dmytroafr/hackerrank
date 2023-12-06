package org.example.first;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> stringSet = new HashSet<>();
        while (n-->0){
            stringSet.add(scanner.nextLine());
            System.out.println(stringSet.size());
        }



    }

}