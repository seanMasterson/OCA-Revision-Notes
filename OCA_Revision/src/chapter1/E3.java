package chapter1;

public class E3 {

	public static void main(String[] args) {
		// DESTROYING OBJECTS //
		
		// The Heap: a large pool of unused memory allocated to a Java application. It is limited in size,
		// despite being very large.
		
		System.gc(); // Garbage Collection - NOT GUARANTEED TO RUN.
		
		/* An Object is no longer reachable when: 
		 * -- It has no references pointing to it.
		 * -- all references have gone out of scope.
		 * */
		
		Integer num1 = new Integer(5);
		// num1 is the reference: can be assigned to another reference, passed to a method or returned from a method.
		// All references are the same size.
		
		// Objects sit on the heap, they do not have names. They are of variable size and cannot be assigned to another object.
		// Objects cannot be passed or returned via methods either.
		
		// The Object is garbage collected, not the reference.
		
		// .finalize() - - gets called if the garbage collector attempts to collect the object.
		// It is not guaranteed to run, certainly not more than once.
	}

}
