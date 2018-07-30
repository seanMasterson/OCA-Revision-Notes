package chapter6;

public class E1 {

	public static void main(String[] args) throws Exception {
		/* EXCEPTIONS AND THEIR ROLE */
		// Exceptions terminate a program once a failure has been run. 
		// They call attention to the failure and request the programmer to handle it.
		
		// N.B. Exceptions alter program flow.
		
		// Runtime(Unchecked) Exceptions - Unanticipated, but can be dealt with. Program is NOT required to declare them.
		// Checked Exceptions - Anticipated, can be dealt with. Program must declare them.
		// Errors - Disastrous, cannot be dealt with.
			
		String[] newArray = new String[0];
		//System.out.println(newArray[0]); - java.lang.ArrayIndexOutOfBoundsException - Runtime Exception
		
		// TRY Statement: handles exceptions
		try { // curly braces are required.
			
			// if an exception occurs, the execution immediately jumps
			// to the catch block, otherwise it won't compile.
			fall(); // java.lang.Exception
		}
		catch(Exception e) { // a catch statement must ALWAYS come after a try statement.
			System.out.println("Your fall was broken.");
		}	
		
		try {
			int y = 6 / 0;
			System.out.println(y);
		}
		catch(ArithmeticException e) {
			System.out.println("Stay this madness!");
		}
		finally { // Optional block, always executes after try regardless if exception is caught or not.
			// N.B. If a finally block is present, the catch statement is not needed 
			// and the try statement may proceed as normal.
			System.out.println("Crisis averted. Work to resume.");
		}
		
		try {
			System.exit(0);
		}
		finally {
			System.out.println("Exception to finally rule. This will never print. System.exit() always ends the program.");
		}
	}
	
	// DECLARE RULE: 
	// throws : tells Java that this method MAY throw an exception.
	// throw : tells Java to throw the exception if it is triggered.
	static void fall() throws Exception {
		throw new Exception();
	}
}
