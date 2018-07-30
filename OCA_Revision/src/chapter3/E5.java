package chapter3;

import java.util.List;
import java.util.ArrayList; // We need this in order to use ArrayList.
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class E5 {

	public static void main(String[] args) {
		/* ARRAY LISTS */
		// An ArrayList, unlike an Array, can change size at runtime as needed.
		
		ArrayList list1 = new ArrayList(); // an arraylist with a default number of unfilled spaces.
		ArrayList list2 = new ArrayList(10); // the size of this list is 10.
		ArrayList list3 = new ArrayList(list2); // the size and content of list2 copied to a new reference.
		
		// Generics - specify the only types or classes that can be stored in an Arraylist.
		ArrayList<Float> floatList = new ArrayList<>();
		floatList.add(23.56F);
		// ArrayList implements an interface called List.
		List<String> names = new ArrayList<>();
		
		/* ARRAYLIST METHODS - 8 OF 'EM */
		
		// .size() - akin to .length for arrays, String and StringBuilder. It outputs the size of the list.
		System.out.println(list2.size()); // 0, as there is nothing in this list.
		
		// .add() - inserts a new value in the list.
		list2.add("SEYMOUR!");
		list2.add("SuperNintendo Chalmers");
		list2.add("Aurora Borealis");
		System.out.println(list2.size()); // 3
		
		// .remove() - removes the first matching value in the list, or at a specific index.
		System.out.println(list2.remove(0).toString());
		System.out.println(list2.size());
		
		// .set() - changes one of the elements of the list without changing the size.
		list2.set(1, "S T E A M E D  H A M S");
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		// .isEmpty() - returns a boolean determining whether the list is empty or not.
		System.out.println(list3.isEmpty()); // true
		
		// .clear() - discards all elements in the list.
		list2.clear();
		System.out.println(list2.size()); // 0
		
		// .contains() - checks for a certain value.
		System.out.println(floatList.contains(23.56F)); // true
		System.out.println(floatList.contains(67)); // false
		
		// .equals() - custom implementation: can compare two lists to check for same elements in same order.
		System.out.println(floatList.equals(names)); // false
		
		/* Wrapper Classes */
		
		// each primitive type has its own Wrapper class - an object type that corresponds to the primitive. 
		
		// .parse***() where *** is a Wrapper - converts a String to a primitive specified by the wrapper,
		// i.e. Integer.parseInt(), Boolean.parseBoolean(), etc.
		
		// .valueOf - converts a String to an instance of a Wrapper class, i.e. Boolean.valueOf, Double.valueOf(), etc.
		
		// Only the Character Wrapper class does not use the parse/valueOf methods.
		
		// AUTOBOXING - type in a value, and Java automatically converts it to the relevant Wrapper class.
		floatList.add(4.56F); // 4.56F --> new Double()
		// floatList.add(null); - NullPointerException
		// Be careful with Integer autoboxing - you can confuse removing or adding ints with ArrayList elements.
		
		// Converting ArrayList to an Array: .toArray()
		// Array to a List: .asList()
		
		//Sorting - from least to greatest, or from A - Z, a - z.
		floatList.add(35F);
		floatList.add(23.56F);
		Collections.sort(floatList);
		System.out.println(floatList); // [4.56, 23.56, 23.56, 35.0]
	}
}