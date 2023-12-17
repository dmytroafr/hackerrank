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

class Result21 {

	/*
	 * Complete the 'bonAppetit' function below.
	 *
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY bill
	 *  2. INTEGER k
	 *  3. INTEGER b
	 */

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// Write your code here
		bill.remove(k);
		int a = bill.stream().mapToInt(Integer::intValue).sum()/2;

		if (a==b){
			System.out.println("Bon Appetit");
		} else {
			System.out.println(Math.abs(a-b));
		}

	}

}

public class Solution21 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		Result21.bonAppetit(bill, k, b);

		bufferedReader.close();
	}
}
