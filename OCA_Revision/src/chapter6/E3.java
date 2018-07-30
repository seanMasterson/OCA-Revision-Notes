package chapter6;

import java.io.FileNotFoundException;
import java.io.IOException;

class DiceFallsOnFloorException extends Exception {}

public class E3 {
	// Calling Methods that call Exceptions
	public static void main(String[] args) throws DiceFallsOnFloorException /* 1. You can do this.*/ {
		/* 2. You can write a try block too, both are permitted, but use at least one for your checked exceptions.*/
		try {
			throwDice();	
		} 
		catch(DiceFallsOnFloorException e) {
			System.out.println("Does this run?");
		}
	}
	
	public static void throwDice() throws DiceFallsOnFloorException {
		System.out.println("You won the roll.");
	}
}

/* EXCEPTIONS AND SUBCLASSES */

// When a subclass implements an interface method/ overrides a parent class method, it CANNOT add
// new checked exceptions to the method signature.

class Hopper {
	public void hop() {}
}
class Bunny extends Hopper {
	// public void hop() throws DiceFallsOnFloorException {} - cannot compile
}

// A subclass can declare up to the same amount of exceptions its parent has, but no more.
// A class can also declare an Exception subclass too.

class Person {
	public void vote() throws Exception, FileNotFoundException {}
}
class Leader extends Person {
	public void vote() throws IOException /* This works because IOException is a subclass of Exception*/ {}
}
class Citizen extends Person {
	public void vote() throws Exception, RuntimeException {}
}
class Refugee extends Person {
	public void vote() {
		// super.vote(); - Unhandled exception type FileNotFoundException - calling the method, not overriding.
	}
}
