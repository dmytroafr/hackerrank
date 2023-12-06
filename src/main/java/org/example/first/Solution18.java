package org.example.first;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution18 {

    public static void main(String[] args){

//        Scanner in = new Scanner(System.in);
        File file = new File("/Users/dmitrijafrosin/IdeaProjects/hackerrank/src/main/resources/input02.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int testCases = Integer.parseInt(bufferedReader.readLine());
            while (testCases > 0) {
                String line = bufferedReader.readLine();

                Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>",Pattern.DOTALL);
                Matcher matcher = pattern.matcher(line);
                boolean flag = false;
                while (matcher.find()) {
                    flag = true;
                    System.out.println(matcher.group(2));

                }
                if (!flag) System.out.println("None");
                testCases--;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}