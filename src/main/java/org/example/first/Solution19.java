package org.example.first;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
import java.util.stream.Collectors;

public class Solution19 {
    public static void main(String []args){
        //Input
//        Scanner sc= new Scanner(System.in);
        File file = new File("/Users/dmitrijafrosin/IdeaProjects/hackerrank/src/main/resources/input03.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int n = Integer.parseInt(bufferedReader.readLine());
//            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
//                s[i]=sc.next();
                s[i] = bufferedReader.readLine();
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }

            s = Arrays.stream(s).sorted(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1==null) return 0;
                    BigDecimal a = new BigDecimal(o2);
                    BigDecimal b = new BigDecimal(o1);

                    return a.compareTo(b);

                }
            }).toArray(String[]::new);
//
//            for (int i = 0; i < n-1; i++) {
//                for (int j = i+1; j < n; j++) {
//                    BigDecimal a = new BigDecimal(s[i]);
//                    BigDecimal b = new BigDecimal(s[j]);
//
//                    if (a.compareTo(b)<0){
//                        String temp = s[i];
//                        s[i] = s[j];
//                        s[j] = temp;
//                    } else if (a.compareTo(b)==0) {
//                        if (i < j) {
//                            // Якщо індекс 'i' більший, ніж індекс 'j', міняємо місцями
//                            String temp = s[i];
//                            s[i] = s[j];
//                            s[j] = temp;
//                        }
//                    }
//                }
//            }

            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
//
//
//            List<BigDecimal> bigDecimalList = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                BigDecimal cast = new BigDecimal(s[i]);
//                bigDecimalList.add(cast);
//            }
//            System.out.println();
//            bigDecimalList.forEach(System.out::println);
//            System.out.println();
//
//            List<BigDecimal> bigDecimalList2 = bigDecimalList.stream().sorted(Collections.reverseOrder()).toList();
//            bigDecimalList2.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}