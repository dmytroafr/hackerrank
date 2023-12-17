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

class Result22 {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. INTEGER n
	 *  2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		Map<Integer, Integer> map = new HashMap<>();
		int pairs = 0;
		for (Integer i : ar){
			if (map.containsKey(i)){
				pairs++;
				map.remove(i);
			} else {
				map.put(i,1);
			}
		}
		return pairs;

	}

}

public class Solution22 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		int result = Result22.sockMerchant(n, ar);
		System.out.println(result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();

		bufferedReader.close();
//		bufferedWriter.close();
	}
}
