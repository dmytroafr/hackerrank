package org.example.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger out = new BigInteger(n);
        if (out.isProbablePrime(0)){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
