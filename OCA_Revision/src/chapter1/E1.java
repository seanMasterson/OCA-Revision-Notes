package chapter1; // A grouping of classes. This must be declared first before anything in a file.

import java.util.Scanner; // imports are statements that tie in required classes from other packages. 
import java.nio.file.*;
/*import java.sql.Date;
import java.util.Date;*/

/**
 Wildcards only match class names.
 You cannot have more than one wildcard. This will fail -> import java.nio.*.*;
 You cannot import methods, only class names. This will fail-> import java.nio.files.Paths.*;
 A package statement can never have a *. It should specify the exact package name.
*/

public class E1 { // One public class is allowed per file. The public class must have the same name as the file.
	
	/* This is a global/ member variable. Declared outside a method
     * and within the class curly brackets. 
     * All member variables get default values. */
    int memVariable;    // 0
    boolean isWinter;   // false
	
	public float n0 = 0b1101; // Binary [0b/ 0B]
	public double n1 = 0xFAF12; // Hexadecimal [0x]
	public long n2 = 056; // Octal [0]
	static public float n3 = 0.67f; // static (class) variables do not need a instance to be printed.
	
	double d1; double d2; // [default access modifier]
	short s0, s1;
	
	// The words in maroon are keywords, the words in light blue are variables.
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// System.out.println(args[0]); Throws an ArrayIndexOutOfBounds Exception, 
		// I guess I need the command line to enact this.
		// The args array is never null.
		
		// You can have a main method that doesn't take String[] as an argument. 
		// It will not make the class executable from the command line though.
		
		E1 e0 = new E1();
		// Order Of Execution: Statics, Instance Variables, Init Blocks then Constructor.
		
		System.out.println("Dynamo");
		
		E1V2 e1 = new E1V2();
		System.out.println(e1.num0);
		
		Integer num = null; // Reference types can be assigned a value of null.
		// int num0 = null;  However, primitives cannot be assigned null.
		
		boolean b1 = false, b2;
		
		System.out.println(b1 + " " + num);
		// System.out.println(b2);  - b2 cannot be printed as it has not been assigned.
		System.out.println(e0.n0 + " " + e0.n1 + " " + e0.n2);
		System.out.println(n3); // static (class) variables do not need a instance to be printed.
		
		/* Without an import, I would have to write the full name
		 * of the class as follows: */
		java.util.ArrayList<String> myList = new java.util.ArrayList<>();
	}
	
	public void $Return1(String args[]) {
		
	}	
	
	public void $andAnotherReturn(int n1, String... args) {
		// varargs must be the last specified variable in a parameter list.
	}
	
	public void _andAnotherReturn(boolean b1) {
		
	}
	
	public E1() {
		// No-Args Constructor.
		System.out.println("In Constructor");
	}
	
	{int n0 = 1000; System.out.println(n0);} // instance initialiser block.
	
	static {boolean b0 = true; System.out.println(b0);} // static init block. Static variables are initialised before ANYTHING else.
}

class E1V2 {
	public int num0, num1 = 5; // num0 = 0, num = 5.

	public int getNum0() {
		return num0;
	}
	public void setNum0(int num0) {
		this.num0 = num0;
	}

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
}

// public class E1V2 {} : Only one public class is allowed per file. The public class must have the same name as the file.
// public classes are not required in a file, however.
