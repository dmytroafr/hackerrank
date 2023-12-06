package org.example.first;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution24 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {


                arr.add(
                        Stream.of(bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        int max = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                int sum = arr.get(j).get(i) + arr.get(j).get(i+1) + arr.get(j).get(i+2)
                        + arr.get(j+1).get(i+1)
                        + arr.get(j+2).get(i) + arr.get(j+2).get(i+1) + arr.get(j+2).get(i+2);
                if (i==0 && j==0) {
                    max = sum;
                } else {
                    max = Math.max(max, sum);
                }

            }
        }
        System.out.println(max);
    }
}
