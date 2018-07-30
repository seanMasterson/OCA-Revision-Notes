package chapter3;

public class E2 {
	static int[] x = new int[0]; 
	//static{x[0] = 10;}
	
	public static void main(String[] args) {
		/* Method Chaining */
		// You can call multiple methods on the one string. Each method creates a new String object.
		
		String kellyShaefer = " Kelly Shaefer   ".trim().toLowerCase().replace('e', 'X');
		System.out.println(kellyShaefer); // kXlly shaXfXr
		
		/* StringBuilder */
		// The StringBuilder class creates a String whilst waiving unused String variables that may be created.
		// StringBuilder : MUTABLE
		
		StringBuilder antisocial = new StringBuilder();
		for(char count = '0'; count <= '9' ; count++)
			antisocial.append(count);
		System.out.println(antisocial); // 0123456789
		
		/* StringBuilder Mutability and Chaining */
		// When subject to chained methods, a StringBuilder object changes its own state and returns a reference to itself.
		
		StringBuilder fiveMagics = new StringBuilder("Give me ");
		fiveMagics.append("Alchemy, ");
		StringBuilder megadeth = fiveMagics.append("give me Sorcery, ");
		megadeth = megadeth.append("give me Wizardry, Thaumatology, ").append("Electricity, Master all of these.");
		
		// Both of these printouts show the same result. As stated, StringBuilder returns references to an original object.
		System.out.println(fiveMagics);
		System.out.println(megadeth);
		
		// Create a StringBuilder
		StringBuilder lakker = new StringBuilder(); // empty character sequence
		StringBuilder maeslanstkeringGating = new StringBuilder("Headbang");
		StringBuilder reclamation = new StringBuilder(15); // reserves a number of slots for a future character set.
		
		//short s = Short.MAX_VALUE; 
		//char c = s;    <-- java.lang.ExceptionInInitializerError
		//System.out.println( c == Short.MAX_VALUE);  
		
		/* STRINGBUILDER METHODS - 10 OF 'EM */
		
		// .charAt(), .indexOf(), .length(), .substring() - all are exactly the same as they are in the String class.
		
		/*
		 * Note that the method substring() in StringBuilder/StringBuffer returns a String (and not a reference to itself, 
		 * unlike append, insert, and delete). So another StringBuilder method cannot be chained to it. For example, 
		 * the following is not valid: sb.append("a").substring(0, 4).insert(2, "asdf");  
		 * The following is valid though:  String str = sb.append("a").insert(2, "asdf").substring(0, 4);
		 * */
		
		// .append() - adds a parameter to StringBuilder and returns a reference to the current StringBuilder.
		StringBuilder theKnot = new StringBuilder().append("Michael Gira").append(20).append(false);
		// There are 10 method signatures for .append(), and they pass in all primitive types.
		System.out.println(theKnot); // Michael Gira20false
		StringBuilder khalid = new StringBuilder().append(new Integer(12445));
		System.out.println(khalid); // 12445 - Autoboxing works as well.
		
		// .insert() - adds characters at a requested index.
		StringBuilder golgothanRemains = new StringBuilder().insert(0, 33.48);
		golgothanRemains.insert(1, " Benedictine Convulsions "); // As we add/remove characters, their indexes change.
		golgothanRemains.insert(12, " bricker ");
		System.out.println(golgothanRemains); // 3 Benedictin bricker e Convulsions 3.48
		
		// .delete() / .deleteCharAt() - I mean...
		StringBuilder nastyWord = new StringBuilder("Motherfucker");
		nastyWord.delete(7, 10);
		nastyWord.insert(7, "***");
		System.out.println(nastyWord); // Motherf***er
		
		// .reverse() - again, a face-value name for a simple method.
		StringBuilder danny = new StringBuilder("redrum");
		System.out.println(danny.reverse());
		
		// .toString() - converts the StringBuilder to a double, of course.
		// StringBuilder is often used internally for performance purposes, but the end result must always be a string.
		
		// ***StringBuffer***  //
		// It might still be on the exam in the form of older questions,
		// but it is exactly the same as StringBuilder, but slower because it is thread-safe.
	}
}
