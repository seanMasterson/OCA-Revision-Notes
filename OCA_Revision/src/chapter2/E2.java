package chapter2;

public class E2 {
	
	public static void main(String[] args) {
		
		String s = "Wee";
		
		/*UNARY OPERATORS*/
		
		// Logical complement operator (!)
		boolean x = false;
		x = !x;
		System.out.println(x); // true
		
		// Negation operator (-)
		double y = 1.25;
		y = -y;
		System.out.println(y); // -1.25
		
		// Increment Operators
		
		int counter = 0;
		System.out.println(counter++); // 0: The variable is incremented after use.
		System.out.println(++counter); // 2: The variable is incremented before use.
		System.out.println(counter--); // 2
		System.out.println(counter); // 1
		
		int counter0 = 10;
		int y0 = ++counter0 * 5 / counter0-- + --counter0; // 4 * 5 / 4 + 2 = 7
		System.out.println(y0); // 7
		System.out.println(counter0); // 2
		
		System.out.println(Double.MAX_VALUE + Double.valueOf(1d));
		
		short s0 = 6;
		short s1 = 9;
		short s2 = (short)(s0 + s1); // casting the value to a short data type.
		// short s3 = s0 + s1; Compiler error: cannot convert from int to short
		System.out.println(s2); // 15 : data type is short.
		
		/* COMPOUND OPERATORS */
		
		long l0 = 10;
		int a = 5;
		
		a = a * (int)l0; // 50
		a *= l0; // Automatic conversion of l0 to an int type. a is 500 now.
		System.out.println(a);
		
		// The result of the assignment is an expression in and of itself, equal
		// to the value of the assignment.
		
		long alpha = 5;
		long beta = (alpha = 7); // alpha is set to 7, and the value is returned.
		
		System.out.println(alpha + ", " + beta); // They both equal 7.
		
		/* RELATIONAL OPERATORS*/
		
		// Return a boolean value.
		
		System.out.println(3 < 4); // true
		System.out.println(5.6 >= 5.68); // false
		System.out.println(7 == 7.0); // true - is 7 promoted to a floating-point value? It is. (You think this is the real McQuaid?)		
		
		int i = 1234567890;
		float fl = i;
		System.out.println(i - (int)fl);
		
		int c = 1, d = 10;
		   do {
		      if (c++ > --d) continue;
		   } while (c < 5);
		   System.out.println("c =" + c + ", d =" + d);
		   
		   int e, f, g; 
		   e = f = g = 9;
		   System.out.println(e);
	}
}
