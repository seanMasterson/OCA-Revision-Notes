package chapter2;

public class E1 {
	public static void main(String[] args) {
		
		/* BINARY ARITHMETIC OPERATORS */
		
		int y = 4;
		
		double x = 2 + 3 * --y;
		System.out.println(x + "\n"); // My guess is 11.0. I was right.
		
		int x1 = 2 * 5 + 3 * 4 - 8;
		System.out.println(x1 + "\n"); // My guess is 14. I was right.
		
		int x2 = 2 * ((5 + 3) * 4 - 8);
		System.out.println(x2 + "\n"); // My guess is 64. I needed to evaluate 5 + 3 and 
									   // then multiply the answer by 4. The answer is 48.
		
		System.out.println(Byte.MAX_VALUE); // 127 - You need to know this value.
		System.out.println(Byte.MIN_VALUE); // -128 - You need to know this value.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE + "\n");
		
		// All arithmetic operators (+,-,*,/,%) are applicable to all primitive types
		// with the exception of boolean.
		
		// With the case of Strings, only += (appending) and + (concatenation) may be applied.
		
		System.out.println(9 % 3); // 0
		System.out.println(9 % 5); // 4
		System.out.println(9 / 5); // This is naturally printed as an int variable. 
								   // Casting it to a floating-point datatype converts it to 1.0.
				
		/* NUMERIC PROMOTION*/
		byte b0 = (byte)6 *(char)2;
		
		// I. If two values have different types, the smaller type is promoted. 
		System.out.println("b0 : " + b0); // 12, promoted to byte(?)
		
		// II. If one value is integral and the other is floating point, the integral is promoted to float.
		System.out.println(3.5d + 6); // 9.5, promoted to double.
		System.out.printf("%.2f\n", 5.4f * 3.4d); // 18.36, promoted to double.  
		System.out.println(6 / (byte)3); // 2, promoted to int. Java doesn't seem to print this for me for some reason...
		
		// III. Every data type < int will be promoted to int when used with an operator - byte, char, short.
		Byte b1 = 3;
		System.out.println(b1.getClass()); // class java.lang.Byte
		// byte b2 = b1 + 3;  - Type mismatch: cannot convert from int to byte
		short s0 = 8;
		Short s1 = 7 + 14;
		System.out.println(s0 + ", " + s1 + ", " + s1.getClass()); // 21 class java.lang.Short
		
		// IV. The result of any numeric promotion will have the same type as the promoted operands.
		short x0 = 14;
		float y0 = 13;
		double z = 30;
		System.out.printf("%.2f\n", x0 * y0 / z); // 6.07, double
		System.out.printf("%.2f\n", x0 * (y0 / z)); // 6.07, double
		System.out.printf("%.2f\n", (x0 * y0) / z); // 6.07, double
		
		// Although it is not required for the exam to know the integral values of characters, 
		// it is good to know that all English letters (upper case as well as lower case) 
		// as well as 0-9 are below 127 and so are assignable to byte.
	}
}
