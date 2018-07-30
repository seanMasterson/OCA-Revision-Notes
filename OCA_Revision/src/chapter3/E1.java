package chapter3;

public class E1 {
	public static void main(String[] args) {
		// String: a sequence (array...) of characters.
		
		String name = "fluffy"; // This is a reference type, from Chapter 1. int i0 = 6; - This would be a value type.
		String name0 = new String("fluffy"); // An alternative method of creating a reference to a string.
		
		// String Concatenation
		System.out.println(name + ", " + name0); // + : evaluated from left to right, can mean either concatenation or numeric addition.
		
		System.out.println(1 + 2); // 3
		System.out.println("1" + "2"); // 12
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(6 / 2 + "f"); // 3f
		
		String theGreatGrowingNumberAHHHHHH = "1";
		theGreatGrowingNumberAHHHHHH += "2"; // Each line here is a new String object.
		theGreatGrowingNumberAHHHHHH += "4";
		theGreatGrowingNumberAHHHHHH += "8" + "16" + "24";
		System.out.println(theGreatGrowingNumberAHHHHHH); // 12481624
		
		// Immutability
		// Once a String object is created, it is not allowed to change. The un-squishable box.
		
		String s0 = "1";
		String s1 = s0.concat("2"); // This is allowed, as the String s1 is being created for the first time.
		// s2.concat("3"); - This is not allowed, as now we are changing the string.
		
		// Strings are an ubiquitous feature of Java, and naturally consume a significant portion of memory.
		// To deal with this, Java allocates a location to collect reused Strings - the String Constant Pool.
		
		// The String Pool contains literal values.
		// String name = "fluffy"; - This goes straight to the pool.
		// String name0 = new String("fluffy"); - This creates a String object separate from literals.
		
		/* STRING METHODS - 13 OF 'EM */
		
		// .length() - Returns the length of the string.
		String animal = "Giraffe";
		System.out.println(animal.length()); // 7
		
		// .charAt() - Find out what character is at a specific index.
		System.out.println(animal.charAt(1)); //.charAt(i) : Zero-indexed!
		// System.out.println(animal.charAt(7)); - StringIndexOutOfBoundsException, it goes beyond the boundary of the string.
		
		// .indexOf() - finds the first index that matches the value.
		System.out.println(animal.indexOf('m')); // returns -1. -1 prints when no match is found.
		System.out.println(animal.indexOf("ra")); // 2
		System.out.println(animal.indexOf('f', 5)); // 5, if true the index is returned as is.
		System.out.println(animal.indexOf("f", 4) + ", mark.\n"); // 4 index
		
		// .substring() - looks for characters in a string, but returns a part of the string, 
		// unlike .charAt() which only returns the index of a queried char or String.
		
		System.out.println(animal.substring(0)); // Giraffe
		System.out.println(animal.substring(3)); // affe
		System.out.println(animal.substring(3, 6)); // aff
		System.out.println(animal.substring(2, 7)); // raffe - .length() + 1 can be an end index.
		System.out.println(animal.substring(1, 4)); // ira - substring is starting point inclusive, end point exclusive.
		System.out.println(animal.substring(1)); // iraffe
		System.out.println(animal.substring(animal.indexOf('a'))); // affe
		//System.out.println("bob".substring(2, 1) + "\n"); <-- java.lang.StringIndexOutOfBoundsException - unchecked exception
		
		// .toLowerCase()/ .toUpperCase() - Self-Explanatory.
		System.out.println("EeeWAFDTRGasfg".toLowerCase()); // eeewafdtrgasfg
		System.out.println("hello skyrim!".toUpperCase()); // HELLO SKYRIM!
		
		// .equals() - checks whether two String objects contain the exact same order of characters.
		System.out.println("slayer".equals("Slayer")); // false
		System.out.println(animal.equals(animal)); // true
		
		// .equalIgnoreCase() - ditto as .equals(), but will convert characters to upper/lower case if required.
		System.out.println("slayer".equalsIgnoreCase("Slayer")); // true
		
		// .contains() - looks for matches in the String. Returns true if there is a match.
		System.out.println("hypothesis".contains("s")); // true
		System.out.println("Hypothesis".contains("S".toLowerCase())); // true
		
		// .startsWith() / .endsWith() - evaluates the first/last character in the String.
		System.out.println("elements".endsWith("e".toUpperCase())); // false
		System.out.println("elements".startsWith("e")); // true
		
		// .replace() - simple search and replace (SEEK AND DESTROY) for a character on the String. 
		System.out.println("watchtower".replace('w', 'W') + "!"); // -1 if I include .indexOf(0)
		
		// .replace() can also take in a CharSequence parameter. CharSequence can represent both char and String.
		System.out.println("atheist".replace("a", "A")); // Note that I am passing in strings here (CharSequence)!
		
		// .trim() - removes whitespace from the beginning and end of a string.
		System.out.println("    ...the breeze of a new creation...        ");
		System.out.println("    ...the breeze of a new creation...        ".trim());
		//Class.forName("java.lang.String");
		
		// .concat() - concatenates a new String argument, can only be used in a new String object and not with an existing one.
		String newString = "Err";
		String newerString = newString.concat(newString);
		System.out.println(newerString);
	}
}
