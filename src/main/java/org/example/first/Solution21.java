package org.example.first;

import java.util.Arrays;
import java.util.Scanner;

public class Solution21 {

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"Hello","World"};
        printArray(a);
        printArray(b);
    }

    static<T> void printArray(T[] t){
        for (T el:t) {
            System.out.println(el);
        }
    }
}