package chapter6;

public class E2 {

	public static void main(String[] args) throws RuntimeException {
		String ratm = "";
		int[] arr1 = {0};
		// Exceptions that are subclasses of other exceptions must be specified in the try - catch first.
		try {
			try {
				System.out.println(arr1[1]);
			}
			catch(ArrayIndexOutOfBoundsException e) { // catch methods cannot be chained? They must be caught in a lower scope?
				ratm += "Rage Against ";
				throw new RuntimeException();
			}
		}
		catch(RuntimeException e) {
			ratm += "The Machine";
		}
		finally {
			ratm += "!";
		}
		System.out.println(ratm);
	}
	
	/* RUNTIME EXCEPTIONS Unanticipated, but can be dealt with. Program is NOT required to 
	 * declare them (because it improves code clarity). */
	
	// ArithmeticException : when the code attempts to divide by zero.
	// ArrayIndexOutOfBoundsException : when the code tries to iterate over an array with an illegal index.
	// ClassCastException : when an attempt is made to cast an object into a subclass it is not an instance of.
	// IllegalArgumentException : when an invalid argument is passed into a method.
	// NullPointerException : when a null reference instead of an object reference is operated on.
	// NumberFormatException : when an attempt to turn a String into a numeric type fails because of the String's format. 
	
	/* CHECKED EXCEPTIONS Anticipated, can be dealt with. Program must declare them. */
	
	// IOException : when there is a problem reading a file.
	// FileNotFoundException : when the code tries to reference a file that doesn't exist.
	// InterruptedException : thrown when a thread is waiting, sleeping, or otherwise occupied, 
	// and the thread is interrupted, either before or during the activity.
	
	/* ERRORS - Disastrous, cannot be dealt with. */
	
	// ExceptionInInitializerError : When a static initializer throws an exception and fails to stop it.
	// StackOverflow Error : when a method calls itself on an infinite recursion loop.
	// NoClassDefFoundError : when a class is available at compile time, but not run time.
}
