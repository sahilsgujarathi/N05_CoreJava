// Program to demonstrate Method Overriding.
package org.tnsif.polymorphism;

class Laptop {
	String generation1;
	void specification(String generation1, String generation2) {
		System.out.println("Laptop:- " + generation1);
	}
}

class Dell extends Laptop {
	String generation2;
	
	@Override
	void specification(String generation1 , String generation2) {
		super.specification(generation1, generation2);
		System.out.println("Dell:- " + generation2);
	}
}

// Driver Class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		String generation1 = "Intel I5 9th generation.";
		String generation2 = "RyZen";
		Dell d = new Dell();
		d.specification(generation1, generation2);

	}
}


