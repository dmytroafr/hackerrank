package org.example.second;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.util.stream.Stream;

public class DevTest2 {



    public static int matchAB(String str, int l, int r, int k){
        if(k<1 || k>(r-l)) return -1;
        char[] chars = str.substring(l-1,r).toCharArray();
        int aS = 0;
        int bS = 0;
        int temp = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i]=='A'){
                aS++;
            } else {
                bS++;
            }
            if (i==k-1){
                if (chars[i]=='A'){
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[j]=='B'){
                            if (temp==aS){
                                return j+1;
                            }
                            temp++;
                        }
                    }
                } else {
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[j]=='A'){
                            if(temp==bS){
                                return j+1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "BABABBBABABAAAABBABBABBABBABBABABABBABBABBABBABBABBBA";
        System.out.println(matchAB(str,3,7,2));
    }



}
