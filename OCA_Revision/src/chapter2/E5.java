package chapter2;

public class E5 {

	public static void main(String[] args) {
		/* TERNARY OPERATOR */
		// boolean operand? true operand : false operand
		
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);
		System.out.println(x); // 20
		
		// The second and third expression can be different datatypes, but mind how they are used.
		System.out.println((y > 21)? 2 : "Zebra"); // This compiles because s.o.pln() can convert either operand to a String.
		
		//int z = (x == y)? "Horse" : 4 ; - You obviously cannot assign a String to an int reference.
		
		/* SWITCH STATEMENT */
		
		// Conditional Structure: a single value is evaluated, through which control flow is directed to the first
		// matching branch - a case statement. If a matching branch is not found, the default statement (if present) is executed.
		
		int tester = 97;
		switch(tester) {
		  	case 50: //(0..n* cases) 
		  		System.out.println("Cold.");
		  		break; // < -- OPTIONAL BREAK KEYWORD. They terminate the case and redirect control flow to the next case.
		  	case 75: 
		  		System.out.println("Thawing.");
		  		break;
		  	case 85:
		  		System.out.println("Warming Up.");
		  		break;
		  	case 95: 
		  		System.out.println("Smoking.");
		  		break;
		  	case 97:
		  		System.out.println("Fire.");
		  		break;
		  	default: // OPTIONAL DEFAULT.
		  		System.out.println("You are out of it.");
		  	break;
	    }
		  
		// Valid paramter types: byte, short, char, int, String, Byte, Short, Character, Integer, Enum.
		// BISSCE
		
		// The values in each case must be a COMPILE TIME CONSTANT value of the same data type as the switch variable.
		
		/* WHILE STATEMENT */
		
		// Repetitive control structure: A LOOP.
		int i = 5;
		
		while(true) { // This is an infinite loop. I need the break in the block to stop it!
			System.out.println(i++);
			break; // The while loop only prints out 5 and the loop then breaks.
		}
		
		/* FOR LOOP */
		/* Here, the first part (i.e. the init part) and the second part (i.e. the expression/condition part) part of 
		 * the for loop are empty. Both are valid. (When the expression/condition part is empty, it is interpreted as true.) 
	     * The third part (i.e. the update part) of the for loop does not allow every kind of statement. 
	     * 
	     * It allows only the following statements here:  
	     * 
	     * Assignment, PreIncrementExpression, PreDecrementExpression, PostIncrementExpression, 
	     * PostDecrementExpression, MethodInvocation, and ClassInstanceCreationExpression. 
	     * 
	     * Thus, Math.random()<0.5 is not valid here, and so this will not compile.
		 * */
		
		for(int i0 = 0; i0 < 2; System.out.println(++i0));
	}

}
