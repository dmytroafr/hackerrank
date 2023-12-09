package org.example.third;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        String str = sc.next();
        byte[] bytes = md5.digest(str.getBytes());

        StringBuilder stringBuilder = new StringBuilder();

        for (byte bt:bytes) {
            stringBuilder.append(String.format("%02X",bt).toLowerCase());
        }

        System.out.println(stringBuilder);


    }
}