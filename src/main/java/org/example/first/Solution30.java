package org.example.first;

import java.io.IOException;
import java.util.*;

public class Solution30 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()){
            String input = scan.nextLine();
            System.out.println(isBalanced(input));
        }
    }

    public static boolean isBalanced (String expr){
        Stack<Character> chars = new Stack<>();

        for (char bracket:expr.toCharArray()) {
            if (isOpened(bracket)){
                chars.push(bracket);
            } else if (isClosed(bracket)) {
                if (chars.isEmpty() || !areMatched(chars.pop(),bracket)){
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
    public static boolean isOpened (char bracket){
        return bracket == '(' || bracket == '[' || bracket == '{';
    }
    public static boolean isClosed (char bracket){
        return bracket == ')' || bracket == ']' || bracket == '}';
    }
    public static boolean areMatched (char open, char close){
        return (open =='(' && close == ')') ||
                (open =='[' && close == ']') ||
                (open =='{' && close == '}');
    }
}