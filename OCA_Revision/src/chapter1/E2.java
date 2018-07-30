package chapter1;

import static java.lang.Boolean.FALSE; // Static Import: You can only import static members of a class statically. 

public class E2 {
	
	static int n0 = 15; // Global Class Variable (static): all global variables have default values.
	
	public double d0 = 8.9d; // Global Instance Variable: all global variables have default values.
	
	public static void main(String[] args) {
		
		E2 e0 = new E2();
		e0._aMethod();
		
		String s0 = "Yog-Sothoth"; // Local Variable
		int num;
		int num1 = 6;
		// int num2 = num + num1;  - num must be initialised before use.
		
		// Local variables must always be initialised before use.
		// Local variables can have same name as member variables. 
		// The local variables will simply shadow the member variables with the same names.
		
		java.util.Scanner sc0 = new java.util.Scanner(System.in);
		
		Person p0 = new Person();
		p0.name = "Sean";
		
		Person p1 = new Person();
		p1 = p0; // p1 now refers to the same address in memory as p0.
		
		System.out.println("p0: " + p0.name + " p1: " + p1.name); // p0: Sean p1: Sean
		
		Person p2 = new Person();
		p2.name = "Trapper";
		
		// p2 = p0;
		// System.out.println("p0: " + p0.name + " p1: " + p1.name); p0: Sean p1: Sean
		
		p0 = p2;
		System.out.println("p0: " + p0.name + " p1: " + p1.name); // p0: Trapper p1: Sean
		
		Person p3 = new Person();
		System.out.println(p3.name); // null
		// System.out.println(p3.name.length()); - Exception in thread "main" java.lang.NullPointerException
	}
	
	public void _aMethod() {
		int memVar; // uninitialised local variable that is not used.
	}
}

class Person {
	public String name;
	
	  /*private Person() {
		// This constructor cannot be instantiated.
		}*/
	
	static { 
		// Static init block: used to create static variables. 
		// The static block only gets called once, no matter how many objects of that type you create.
	} 
}
