package org.example.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String,Integer> phonebook = new HashMap<>();

        while (n-- > 0){
            String name = sc.nextLine();
            int phone = Integer.parseInt(sc.nextLine());
            phonebook.put(name,phone);
        }
        while (sc.hasNext()) {
            String find = sc.nextLine();
            if (phonebook.containsKey(find)){
                String out = find+"="+phonebook.get(find);
                System.out.println(out);
            }else {
                System.out.println("Not faund");
            }
        }
        sc.close();
    }
}