package chapter3;

public class E3 {

	public static void main(String[] args) {
		/* EQUALITY */
		
		/* Object Equality: == */
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		System.out.println(s1 == s2); // false, because they are different objects.
		
		StringBuilder s3 = s1.append("Grace");
		System.out.println(s1 == s3); // true, because they are two references pointing to the same object.
		
		String strauss = "Alpine Symphony";
		String richard = "Alpine Symphony";
		
		System.out.println(richard == strauss);  // true, they are both literals in the String Pool.
		
		String s4 = " Behemoth";
		String s5 = s4.trim();
		System.out.println(s5 == s4); // false, once a method operates on a String, it creates a new String object.
		
		String s6 = new String("Frost");
		String s7 = "Frost";
		System.out.println(s6 == s7); // false, specific invocation of a new String object compared to a String literal.
		
		/* Logical Equality: .equals() */
		System.out.println(s6.equals(s7)); // true, .equals() does not look at the elements in a String.
		System.out.println(s1.equals(s2)); // false, .equals() checks reference quality for StringBuilder instances.
		System.out.println(richard.equals(strauss)); // true
	}

}
