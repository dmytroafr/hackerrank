package org.example.third;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
    byte[] bytes = sha256.digest(str.getBytes());
    StringBuilder stringBuilder = new StringBuilder();
        for (byte bt:bytes) {
            stringBuilder.append(String.format("%02X",bt).toLowerCase());
        }
        System.out.println(stringBuilder);


    }
}