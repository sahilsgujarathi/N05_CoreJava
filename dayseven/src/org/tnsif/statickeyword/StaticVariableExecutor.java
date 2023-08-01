// Program to Demonstrate Static Keyword.

/*
 * Static Variable:- If any variable is non-static and outside the main function and if you
 * want to access that variable inside the main function, then we can make that variable as
 * static. 
*/

package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	
	static int num = 67;

	public static void main(String[] args) {
		System.out.println(num);
	}
}
