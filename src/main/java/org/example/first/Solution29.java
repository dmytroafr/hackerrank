package org.example.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution29 {

    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());

        while (n-- >0){
            int[] param = Arrays.stream(buf.readLine().trim().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] game = Arrays.stream(buf.readLine().trim().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (canWin(param[1], game)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int index, int leap, int[] game) {
        if (index < 0 || game[index] == 1) {
            return false;
        }

        if (index == game.length - 1 || index + leap >= game.length) {
            return true;
        }

        game[index] = 1;

        return canWinFrom(index + 1, leap, game) ||
                canWinFrom(index - 1, leap, game) ||
                canWinFrom(index + leap, leap, game);
    }
}