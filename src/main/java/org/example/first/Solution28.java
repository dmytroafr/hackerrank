package org.example.first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Solution28 {

    public static List<Integer> processInput(BufferedReader buf) throws IOException {
        int n = Integer.parseInt(buf.readLine());
        List<Integer> integerList = Stream.of(buf.readLine()
                .replaceAll("\\s+$","")
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int queryN = Integer.parseInt(buf.readLine());

        while (queryN-- > 0){
            String query = buf.readLine().trim();
            if (query.equals("Insert")){
                List<Integer> insert = Stream.of(buf.readLine()
                        .trim()
                        .split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

                if(insert.get(0) > integerList.size()){
                    integerList.add(insert.get(1));
                } else {
                    integerList.add(insert.get(0), insert.get(1));
                }

            } else if (query.equals("Delete")){
                int remove = Integer.parseInt(buf.readLine());
                integerList.remove(remove);
            }
        }

        return integerList;
    }

    public static void printOutput(List<Integer> integerList) {
        integerList.forEach(i -> System.out.print(i + " "));
    }

    public static void main(String[] args) {
        try {
            File file = new File("/Users/dmitrijafrosin/IdeaProjects/hackerrank/src/main/resources/input04.txt");
            BufferedReader buf = new BufferedReader(new FileReader(file));

            List<Integer> result = processInput(buf);
            printOutput(result);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}