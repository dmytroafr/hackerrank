package org.example.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> lists = new ArrayList<>();
        int listN = sc.nextInt();
        sc.nextLine();

        while (listN-- >0){
            lists.add(Arrays.stream(sc.nextLine()
                    .replaceAll("\\s+$","")
                    .split(" "))
                    .map(Integer::parseInt).collect(Collectors.toList()));
        }
//        lists.forEach(l-> l.forEach(System.out::println));
        int queryN = sc.nextInt();
        sc.nextLine();
        while (queryN-- >0){
            List<Integer> query;
            query = Arrays.stream(sc.nextLine()
                    .replaceAll("\\s+$","")
                    .split(" "))
                    .map(Integer::parseInt).toList();
            int list = query.get(0)-1;
            int elem = query.get(1);

            if (elem<=lists.get(list).size()){
                System.out.println(lists.get(list).get(elem));
            }else {
                System.out.println("ERROR!");
            }
        }





    }




}