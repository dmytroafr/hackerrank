package org.example.third;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result16 {

	/*
	 * Complete the 'breakingRecords' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts INTEGER_ARRAY scores as parameter.
	 */

	public static List<Integer> breakingRecords(List<Integer> scores) {

		int[] range = new int[]{scores.get(0),scores.get(0)};

		int maxS = (int) scores.stream().filter(i->{
			if (i> range[0]){
				range[0] = i;
				return true;
			}
			return false;
		}).count();

		int minS = (int) scores.stream().filter(i->{
			if (i< range[1]){
				range[1] = i;
				return true;
			}
			return false;
		}).count();



		return Stream.of(maxS,minS).collect(toList());



	}

}

public class Solution16 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result16.breakingRecords(scores);

//		bufferedWriter.write(
//				result.stream()
//						.map(Object::toString)
//						.collect(joining(" "))
//						+ "\n"
//		);

		bufferedReader.close();
//		bufferedWriter.close();
		System.out.println(result);
	}
}

