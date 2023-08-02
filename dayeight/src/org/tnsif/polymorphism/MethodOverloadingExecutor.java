// Program to demonstrate on Compile Time Polymorphism.
package org.tnsif.polymorphism;
import java.util.Scanner;

class Bollywood {
	String str1, str2, str3;
	
	// Method Overloading based on changing the no of arguments.
	static void display(String str1, String str2) {
		System.out.println(str1 + " loves " + str2);
	}
	
	static void display(String str1, String str2, String str3) {
		System.out.println(str1 + " loves " + str2 + " as well as " + str3);
	}
}

// Driver Class.
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		Bollywood.display(str1, str2);
		Bollywood.display(str1, str2, str3);
		
		sc.close();
	}

}
