package org.example.first;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            System.out.println(count + " " + scanner.nextLine());
        }
    }
}