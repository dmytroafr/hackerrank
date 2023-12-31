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

class Result14 {

	/*
	 * Complete the 'kangaroo' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER x1
	 *  2. INTEGER v1
	 *  3. INTEGER x2
	 *  4. INTEGER v2
	 */

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		int initDiff = Math.abs(x1-x2);
		do {
			x1+=v1;
			x2+=v2;
			if (x1==x2) {
				return "YES";
			}
		} while (Math.abs(x1-x2)<initDiff);
		return "NO";
	}

}

public class Solution14 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int x1 = Integer.parseInt(firstMultipleInput[0]);

		int v1 = Integer.parseInt(firstMultipleInput[1]);

		int x2 = Integer.parseInt(firstMultipleInput[2]);

		int v2 = Integer.parseInt(firstMultipleInput[3]);

		String result = Result14.kangaroo(x1, v1, x2, v2);
		System.out.println(result);

//		bufferedWriter.write(result);
//		bufferedWriter.newLine();

		bufferedReader.close();
//		bufferedWriter.close();
	}
}

