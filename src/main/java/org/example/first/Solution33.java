package org.example.first;

import java.util.BitSet;
import java.util.Scanner;

public class Solution33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int n = scanner.nextInt();
        BitSet bitSet = new BitSet(length);
        BitSet bitSety = new BitSet(length);

        while (n-->0){
            String query = scanner.next();
            int par1 = scanner.nextInt();
            int par2 = scanner.nextInt();

            if (query.equals("AND")){
                if (par1==1 && par2 ==2){
                    bitSet.and(bitSety);
                } else if (par1==2 && par2 ==1) {
                    bitSety.and(bitSet);
                }
            } else if (query.equals("SET")) {
                if (par1 == 1){
                    bitSet.set(par2);
                }else {
                    bitSety.set(par2);
                }
            } else if (query.equals("XOR")) {
                if (par1==1 && par2 ==2){
                    bitSet.xor(bitSety);
                } else if (par1==2 && par2 ==1) {
                    bitSety.xor(bitSet);
                }
            }else if (query.equals("FLIP")) {
                if (par1 == 1){
                    bitSet.flip(par2);
                }else {
                    bitSety.flip(par2);
                }
            }else if (query.equals("OR")) {
                if (par1==1 && par2 ==2){
                    bitSet.or(bitSety);
                } else if (par1==2 && par2 ==1) {
                    bitSety.or(bitSet);
                }
            }
            System.out.println(bitSet.cardinality() + " " + bitSety.cardinality());
        }
        scanner.close();
    }
}
