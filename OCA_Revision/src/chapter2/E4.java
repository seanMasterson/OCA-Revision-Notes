package chapter2;

import java.util.Calendar;

public class E4 {
	public static void main(String[] args) {
		// A statement is a complete unit of execution in Java, terminating with a semicolon.
		// A block of code is everything enclosed in a set of {} (curly braces).
		
		// IF statement: 
		// if the expression in the if parameter evaluates to true, the block of code runs.
		
		if(true) // curly braces are not necessary if there is only statement.
			System.out.println("Alri");
		
		int hourOfDay = (int)Calendar.HOUR; // 12 - hour clock.
		int count = 0;
		
		if(hourOfDay < 11) {
			System.out.println("Evening!"); 
			count++;
		}
		
		// IF - ELSE statement
		
		if(hourOfDay > 11) {  // braces are required for this statement, as there are two lines of code. 
			System.out.println("Evening!"); 
			count++;
		}
		else { // like the IF, I can have no braces if there is only one statement.
			System.out.println("Morning?");
		}
		
		// We can also increase the possible amount of results by using an IF - ELSE IF - ELSE block.
		
		int value = 11;
		int test = Integer.compare(value, 12); // -1 : The result says that one less than the int it is compared to.
		int test1 = Integer.compare(10, 10); // 0
		int test2 = Integer.compare(10, 9); // 1
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(value *= test);
		System.out.println(value);
		
		if(value == test) 
			System.out.println("True");
		else if (value != test) 
			System.out.println("False");
		else if((value *= test) == -10) { 
			System.out.println("This should not print."); 
		}										  
		else 
			System.out.println("This might print."); // It doesn't. Upon finding 
													 // a valid expression, the result is printed.
		
		// DO REMEMBER: IF ELSE branches are mutually exclusive.
	}
}
