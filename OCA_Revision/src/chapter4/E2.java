package chapter4;

/* Static Imports */
// For importing static members of classes.

import static java.util.Arrays.asList; //.asList() is a static member.

public class E2 {	
	static int count = 5;
	
	public static void main(String[] args) {
		// STATIC METHODS AND FIELDS
		// Shared amongst all users of the class.
		// Used For : State shared by instances (e.g. a counter variable), 
		// and utility methods that do not require a state (e.g. main).
		
		// You can use a class instance to call a static
		E2 i = new E2();
		System.out.println(i.count); // 5
		i = null;
		System.out.println(i.count); // 5 - Because we have accessed a static which exists before anything else, we can still access it.
		// Tip: When you see a static method / variable, check its reference type!
		// The exam may trick me into thinking a NullPointerException may arise.
	}
	// FINAL VARIABLES
	// These are constant values - never changed at all during the program.
	public static final int FINAL_NUM = 3;
	
	// Static Initialisation
	static { 
		String name = "Sean Masterson"; // local variables of the static block.
		int newNum = 4;
	}
	
	/*
	 * There are a couple of important concepts in this question:  
	 * 1. Within an instance method, you can access the current object of the same class using 'this'. 
	 * Therefore, when you access this.myValue, you are accessing the instance member myValue of the ChangeTest instance.  
	 * 
	 * 2. Within the showOne() method, there are two variables accessible with the same name myValue. 
	 * If you declare a local variable (or a method parameter) with the same name as the instance field name, 
	 * the local variable "shadows" the member field. One is the method parameter and another is the 
	 * member field of ChangeTest object. Ideally, you should be able to access the member field in the method 
	 * directly by using the name of the member (in this example, myValue). However, because of shadowing, 
	 * when you use myValue, it refers to the local variable instead of the instance field.  
	 * 
	 * Therefore, when you do : myValue = myValue; you are actually assigning the value contained in 
	 * method parameter myValue to itself. You are not changing the member field myValue. 
	 * Hence, when you do System.out.println(this.myValue); in the next line, it prints 0.   
	 * Now, in showTwo(), you are assigning the value contained in myValue (i.e. 200) to this.myValue, 
	 * which is the instance member.  Therefore, in the next line, when you print this.myValue, it prints 200.
	 * */
	
	/*
	 * Pass-by-value
		The actual parameter (or argument expression) is fully evaluated and the resulting value 
		is copied into a location being used to hold the formal parameter's value during method/function execution. 
		That location is typically a chunk of memory on the runtime stack for the application (which is how Java handles it), 
		but other languages could choose parameter storage differently.
		
	 * Pass-by-reference
		The formal parameter merely acts as an alias for the actual parameter. 
		Anytime the method/function uses the formal parameter (for reading or writing), it is actually using the actual parameter.
	 * */
}
