package org.example.third;

import javax.xml.crypto.Data;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.zip.DataFormatException;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result20 {

	/*
	 * Complete the 'dayOfProgrammer' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts INTEGER year as parameter.
	 */

	public static String dayOfProgrammer(int year) {


		int day = 13;
		int month = 9;


		if (year>1918){
			if ((year%4==0 && year%100!=0) || year%400==0){
				day--;
			}
		}else {

			if (year==1918){
				day += 13;
			}else {
				if (year%4==0){
					day--;
				}
			}
		}
		return String.format("%02d.%02d.%04d", day, month, year);





//
//
//
//
//
//		Instant instant = Instant.now();
//		Date date = new Date(year,12,31);
//
//


//		int programmerDay = 256-1;
//		if (year<1919){
//
////			boolean isLeap = year % 4 ==0;
////			if (isLeap){
////
////			}
//			programmerDay = programmerDay-1;
//		}
//
//		LocalDate localDate = LocalDate.of(year,Calendar.DECEMBER,31);
//
//		localDate = localDate.plusDays(programmerDay);
//		localDate = localDate.minus(Period.ofDays(programmerDay));
//		return localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}

}

public class Solution20 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while (true){
			int year = Integer.parseInt(bufferedReader.readLine().trim());

			String result = Result20.dayOfProgrammer(year);

			System.out.println(result);
		}

//		bufferedReader.close();
	}
}
