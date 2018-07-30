package chapter3;

import java.time.*; // A necessary package for what we are about to use.

public class E6 {

	public static void main(String[] args) {
		/* DATES AND TIMES */
		
		// LocalDate - Only a date. (No time or time zone) --> 05/07/96
		System.out.println(LocalDate.now()); // 2018-03-08
		
		// LocalTime - Only a time. (No date or time zone) --> 12:00
		System.out.println(LocalTime.now()); // 15:38:06.776
		
		// LocalDateTime - Both a date and time, but no time zone. --> 05/07/96 12:00
		System.out.println(LocalDateTime.now()); // 2018-03-08T15:38:06.776
		
	}

}
