package org.example.third;

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

class Result11 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String m = s.substring(8);
        // Write your code here
        String[] str = s.substring(0,8).split(":");
        String converted = "";
        if (m.equals("AM")){
            if (str[0].equals("12")){
                converted = "00";
            } else {
                converted = str[0];
            }
        }else {
            int twonyfour = Integer.parseInt(str[0]);
            if (twonyfour>1 &&twonyfour<12){
                converted =String.valueOf(twonyfour+12);
            }else {
                converted = str[0];

            }

        }

        return converted+":"+str[1]+":"+str[2].substring(0,2);

    }

}

public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result11.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
