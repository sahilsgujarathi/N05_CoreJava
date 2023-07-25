// Driver Class.
// Program to Demonstrate on Default and Parameterized Constructors.
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling Default Constructor.
		Citizen c = new Citizen();		
		
		// Calling Parameterized Constructor.
		Citizen c1 = new Citizen("Adult", 550033188400L, "Male", "Nashik");
		
		System.out.println(c1);
	}
}
