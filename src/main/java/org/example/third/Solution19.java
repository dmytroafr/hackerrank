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

class Result19 {

	/*
	 * Complete the 'migratoryBirds' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static int migratoryBirds(List<Integer> arr) {


		Map<Integer,Integer> map = new HashMap<>();

		for (Integer integer : arr) {
			if (map.containsKey(integer)){
				map.put(integer, map.get(integer)+1);
			}else{
				map.put(integer,1);
			}
		}

		int max = 0;
		int key = 0;
		for (Map.Entry<Integer,Integer> entry: map.entrySet()){
			if (entry.getValue()>max){
				max = entry.getValue();
				key = entry.getKey();
			} else if (entry.getValue()==max) {
				if (entry.getKey()<key){
					key = entry.getKey();
				}
			}
		}
		return key;

	}

}

public class Solution19 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.toList();

		int result = Result19.migratoryBirds(arr);
		System.out.println(result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();

		bufferedReader.close();
//		bufferedWriter.close();
	}
}
