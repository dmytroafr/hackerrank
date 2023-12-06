package org.example.first;

import java.util.*;

public class Solution32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Deque<Integer> integerDeque = new ArrayDeque<>(m);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int el = scanner.nextInt();

            integerDeque.addFirst(el);
            if (integerDeque.size()==m){
                int uniqueInt = uniqueNum(integerDeque);
                max = Math.max(uniqueInt,max);
                integerDeque.pollLast();
            }
        }
        scanner.close();
        System.out.printf("Max element is:%s",max);
    }
    public static int uniqueNum (Deque<Integer> deque){
        Set<Integer> set = new HashSet<>(deque);
        return set.size();
    }
}