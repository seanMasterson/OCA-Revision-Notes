package chapter4;

public class E1 {
	/* ACCESS MODIFIERS */
	
	// public: can be called from any class.
	// protected: can only be called from classes in the same package or subclasses of such.
	// default: can only be called from classes in the same package.
	// private: can only be called from within the same class.
	
	/* OPTIONAL SPECIFIERS */
	
	// static: belongs to a class.
	// abstract: cannot have a body and cannot be instantiated by itself, only OVERRIDDEN by a subclass.
	// final: cannot be changed once initialised, can NOT be OVERRIDDEN in a subclass. 
	
	// MODIFIERS AND SPECIFIERS ALWAYS COME BEFORE THE RETURN TYPE IN THE METHOD SIGNATURE.
	
	public static void main(String[] args) /* Exception declarations may go here */ {
		// Method name: may contain letters, numbers, $ or _
		// First character cannot be a number, nor are reserved words allowed.
		
		// Parameter List: 
		// public void (***optional parameter1, optional parameter2 ..., n***)
		
		System.out.println("Varargs Result List: ");
		checkVarargs("Dio"); // 1
		checkVarargs("Superman", "Cliffracer flys so high"); // 2
		checkVarargs(new String[] {"Tinky Winky", "Dipsy", "La-La", "Po"}); // 4
		try {
			checkVarargs(null); // java.lang.NullPointerException
		}
		catch(NullPointerException e) {
			System.out.println("java.lang.NullPointerException");
		}
		
		E1V3 iou = new E1V3();
		iou.returnThis();
		
		E1V1 instance0 = new E1V1();
		instance0.colinStetson();
	} // Code braces are always needed for a method.
	
	static void checkVarargs(String... a) { System.out.println(a.length); } 
	// N.B. A vararg parameter must be the last in a parameter list.
	// Varargs use array indexing, and are accessed much like an array.
	
	int longMethod() {
		return (int)9.6;
	}
	
	static { // runs when the class is first used.
		double i = 2.56;
	}
	
	
}

/* PRIVATE ACCESS */
class E1V1 {
	private String a = "In The Clinches";
	
	void colinStetson() {
		System.out.println(a);
	}
}

class E1V2 {
	E1V1 instance0 = new E1V1();
	
}

// Remember that private members of a class are accessible from the same class.

/* DEFAULT (PRIVATE PACKAGE) ACCESS */
class E1V3 {
	int iou = 14;
	void returnThis() {
		System.out.println(iou);
	}
}

/* PROTECTED ACCESS */
// Important rules for protected:
/*
 * I. A protected member is used without referring to a variable: 
 *  
 *  package pond.swan;
 *  import pond.shore.Bird; <-- protected members
 * 	public class Swan extends Bird {
 * 		public void swim() {
 * 			floatInWater(); // superclass access
 * 			System.out.println(text); // superclass access
 * 		}
 * 
 * II. A member is used through a variable: REFERENCE TYPE MATTERS, PROTECTED ACCESS IS ONLY ALLOWED IN A SUBCLASS.
 * 
 * 		public void swim() {
 *  		Swan other = new Swan();
 * 			other.floatInWater(); // superclass access
 * 			System.out.println(other.text); // superclass access
 * 		}
 * 	}
 * */