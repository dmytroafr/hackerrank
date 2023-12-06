package org.example.first;

import java.util.Arrays;
import java.util.Scanner;

public class Solution12 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()) return false;

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

//        Arrays.sort(first);
//        Arrays.sort(second);
//        return Arrays.equals(first, second);

        boolean flag = false;
        for (int i = 0; i < first.length; i++) {
            boolean flag2 = false;
            for (int j = 0; j < second.length; j++) {
                if (second[j]==first[i]){
                    flag2 = true;
                    second[j] = '-';
                    break;
                }
            }
            flag = flag2;

        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}