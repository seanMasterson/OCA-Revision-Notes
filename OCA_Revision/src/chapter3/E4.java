package chapter3;

public class E4 {

	public static void main(String[] args) {
		/** ARRAYS */
		// Array: area of memory on the heap with space for a designated number of elements.
		// An ordered list, may contain duplicates.
		
		int[] numbers = {3}; // anonymous array: does not specify type or size;
		char [] iii = new char[] {'s','p','e','c','t','r','a','l',' ', 'l','o','r','e'};
		double coordinates[] = new double[13];
		coordinates[4] = 7.93;
		
		for(int i = 0; i < iii.length; i++) {
			System.out.println(iii[i]);
			System.out.println(coordinates[i]);
		}
		
		/*
		 * OUTPUT FOR FOR LOOP AT LINE 15: 
		 * 	s
			0.0
			p
			0.0
			e
			0.0
			c
			0.0
			t
			7.93
			r
			0.0
			a
			0.0
			l
			0.0
			 
			0.0
			l
			0.0
			o
			0.0
			r
			0.0
			e
			0.0
		 * 
		 * */
		
		int[] types, ids; // two int arrays created.
		int gosh, wally[]; // ONE int VARIABLE, one int ARRAY.
		
		
	}

}
