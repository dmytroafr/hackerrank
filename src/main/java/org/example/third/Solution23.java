package org.example.third;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result23 {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here

        int front = p/2;
        if (n%2==0) n+=1;
        int rear = (n-p)/2;
        return Math.min(front, rear);



    }

}

public class Solution23 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result23.pageCount(n, p);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
