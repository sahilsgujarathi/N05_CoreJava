// Program to Demonstrate Static Block.
package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	static float salary;
	String companyName;
	
	/*
	 * Static block is used to initialize the static variable. We can't assign a value for
	 *  any non-static variable inside the static block.
	*/
	
	static {
		// companyName = "Jio";
		salary = 100000.00f;
	}
	
	// Static Method.
	static void print() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		print();
	}
}

