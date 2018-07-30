package chapter2;

public class E3 {

	public static void main(String[] args) {
		/* LOGICAL OPERATORS */ 
		int x = 5;
		int y = 7;
		double z = 5.0;
		
		We we = new We();
		we.main2(); // If this were a static method, you would have to call it on a class instance i.e. We.main2();
		System.out.println();
		// Bitwise - both sides are evaluated.
		
		// AND Operator - both sides must be true to evaluate as true.
		System.out.println((x != y) & (y > x)); // t & t = true
		System.out.println((x == y) & (y > x)); // f & t = false
		System.out.println((x == z) & (z > x)); // t & f = false
		System.out.println((z != z) & (z > y)); // f & f = false
		System.out.println();
		
		// Inclusive OR Operator - only one side must qualify as true for the statement to be true.
		System.out.println((x < y) | (y >= x)); // t | t = true
		System.out.println((x == y) | (y > x)); // f | t = true
		System.out.println((x == z) | (z > x)); // t | f = true
		System.out.println((z != z) | (z > y)); // f | f = false
		System.out.println();
		
		// Exclusive OR Operator - both sides must be of opposite value for the statement to be true. 
		System.out.println((x < y) ^ (y >= x)); // t ^ t = false
		System.out.println((x == z) ^ (y < z)); // t ^ f = true
		System.out.println((x == y) ^ ((z + y) >= x)); // f ^ t = true
		System.out.println((z != z) ^ (z > y)); // f ^ f = false
		
		// Short - Circuit Operators - if the left side of the statement 
		// can determine the result, the right side is never evaluated.
		
		int a = 6;
		boolean b = (a >= 6) || (++a <= 7);
		System.out.println(a);
		
		/* EQUALITY OPERATORS */
		
		// Used for primitive numeric types, booleans and objects (including null and String values).
		
		// DO NOT MIX AND MATCH TYPES. Pay attention to this.
		// e.g. boolean x = true == 3 : this will not compile.
	}
}

class We {
	 public void main2() { 
	      int i = 0 ;
	      boolean bool1 = true;
	      boolean bool2 = false;
	      boolean bool  = false;
	      bool = (bool2 &  method1("1"));  //1
	      bool = (bool2 && method1("2"));  //2
	      bool = (bool1 |  method1("3"));  //3
	      bool = (bool1 || method1("4"));  //4
	   }
	 
	   public static boolean method1(String str){
	      System.out.println(str);
	      return true;
	   }	   
}