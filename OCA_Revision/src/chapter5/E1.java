package chapter5;

public class E1 {

	public static void main(String[] args) {
		/**
		 * To override a method in the subclass, the overriding method (i.e. the one in the subclass) MUST HAVE: 
		 * - same name 
		 * 
		 * - same return type in case of primitives (a subclass is allowed for classes, 
		 * this is also known as covariant return types). 
		 * 
		 * - same type and order of parameters 
		 * 
		 * - it may throw only those exceptions that are declared in the throws clause 
		 * of the superclass's method or exceptions that are subclasses of the declared exceptions. 
		 * It may also choose NOT to throw any exception. 
		 * 
		 * The names of the parameter types do not matter. 
		 * For example, void methodX(int i) is same as void methodX(int k) 
		 * 
		 * */
		
		printSum(1, 2);
		
		try { 
			m();
		} 
		catch (Exception e) {
			}
		System.out.println(s);
	}
	
	public static void printSum(int a, int b){ 
		System.out.println("In int " + (a + b));
	} 
	public static void printSum(Integer a, Integer b){ 
			System.out.println("In Integer " + (a + b)); 
	} 
	public static void printSum(double a, double b){ 
		System.out.println("In double " + (a + b));
	} 
	
	static String s = ""; 
	public static void m0(int a, int b) { 
		s += a; 
		m2();
		m1(b); 
	}
	public static void m1(int i) { 
		s += i; 
	}
	public static void m2() { 
		throw new NullPointerException("aa"); 
	}
	public static void m() { 
		m0(1, 2); 
		m1(3); 
	}
}

/*interface Bozo{ 
	int type = 0; 
	public void jump(); 
}

class Type1Bozo implements Bozo {
	public Type1Bozo(){ 
		type = 1;          
	}  
	public void jump(){ 
		System.out.println("jumping..."+type);          
	}  
}*/